from DBConnector import DBConnector

dbms = DBConnector("pythondb", "m_ac01p_sw_stg")
if not dbms.is_connected(): exit(-1)
dbms.create_table()
print(dbms.render_table())
dbms.table_fill_random()
dbms.count_employees_with_same_surname_as_id8()
print(dbms.render_table())
dbms.remove_employee_with_highest_rate()
print(dbms.render_table())
