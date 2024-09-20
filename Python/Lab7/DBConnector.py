import csv
import sys
import random
import mysql.connector
from tabulate import tabulate


class DBConnector:
    __db = None

    def __init__(self, username, password):
        try:
            self.__db = mysql.connector.connect(
                host="localhost",
                user=username,
                password=password,
                database="pythondb"
            )
        except mysql.connector.Error as err:
            print(f"Помилка зʼєднання з БД: {err.msg}.", file=sys.stderr)

    def is_connected(self):
        return self.__db is not None

    def render_table(self):
        tx = self.__db.cursor()
        try:
            tx.execute("SELECT * FROM it_corporation")
            columns = [row[0] for row in tx.description]
            rows = tx.fetchall()
            return tabulate(rows, headers=columns, tablefmt="fancy_grid")
        except mysql.connector.Error as err:
            return f"Помилка отримання даних з БД: {err.msg}"

    def create_table(self):
        tx = self.__db.cursor()
        try:
            tx.execute("""
            CREATE TEMPORARY TABLE IF NOT EXISTS it_corporation (
                id INTEGER AUTO_INCREMENT PRIMARY KEY,
                last_name TEXT, first_name TEXT,
                birthdate DATE,
                phone VARCHAR(16),
                educ VARCHAR(8),
                position TEXT, department TEXT,
                skills TEXT,
                rate DECIMAL
            )""")
        except mysql.connector.Error as err:
            print(f"Помилка створення таблиці: {err.msg}.", file=sys.stderr)

    def table_fill_random(self):
        tx = self.__db.cursor()
        try:
            with open("data.csv", newline='') as csvfile:
                data = [tuple(row) for row in csv.reader(csvfile)]
                fieldnames = data[0]
                rows = data[1:]
                random.shuffle(rows)
            query = "INSERT INTO it_corporation ({columns}) VALUES ({values})".format(
                columns = ", ".join(fieldnames),
                values = ", ".join(["%s"] * len(fieldnames))
            )
            tx.executemany(query, rows)
            self.__db.commit()
        except FileNotFoundError:
            print(f"Помилка читання файлу з даними.")
        except mysql.connector.Error as err:
            print(f"Помилка заповнення таблиці даними: {err.msg}.", file=sys.stderr)

    def count_employees_with_same_surname_as_id8(self):
        tx = self.__db.cursor()
        try:
            tx.execute("SELECT last_name FROM it_corporation WHERE id = 8")
            last_name = tx.fetchone()
            tx.execute("SELECT COUNT(*) FROM it_corporation WHERE last_name = %s", last_name)
            print(f"Прізвище {last_name[0]} (id = 8) мають {tx.fetchone()[0]} співробітників.")
        except mysql.connector.Error as err:
            print(f"Помилка пошуку/обчислення рядків таблиці: {err.msg}.", file=sys.stderr)

    def remove_employee_with_highest_rate(self):
        tx = self.__db.cursor()
        try:
            tx.execute("SELECT MAX(rate) FROM it_corporation")
            highest_rate = tx.fetchone()
            tx.execute("DELETE FROM it_corporation WHERE rate = %s", highest_rate)
            self.__db.commit()
            print(f"Видалено {tx.rowcount} запис.")
        except mysql.connector.Error as err:
            print(f"Помилка видалення працівника з таблиці: {err.msg}.", file=sys.stderr)