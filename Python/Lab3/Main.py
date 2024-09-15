import sys
# pickle не використовується, адже я працюю з простим текстом, що не потребує серіалізації

ifn = input("Введіть шлях до файлу з текстом: ")
ofn = input("Введіть шлях вихідного файлу: ")
try:
    with open(ifn, "r") as f:
        lines = f.readlines()
    for i in range(len(lines)):
        words = lines[i].split()
        words = [word.upper() if len(word) > 2 else word for word in words]
        lines[i] = " ".join(words) + "\n"
    with open(ofn, "x") as f:
        f.writelines(lines)
    print("Успішно записано.")
except FileNotFoundError:
    print(f"Неможливо знайти файл {ifn}.", file=sys.stderr)
except FileExistsError:
    print(f"Файл {ofn} вже існує.", file=sys.stderr)
except IsADirectoryError:
    print(f"Вказаний шлях є директорією.", file=sys.stderr)
except PermissionError as e:
    print(f"Не вистачає прав доступу до файлу {ifn}.", file=sys.stderr)
except OSError as e:
    print(f"Системна помилка {e.strerror} при доступі до файлу {e.filename}.", file=sys.stderr)
