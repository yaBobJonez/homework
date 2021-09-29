import os
c = os.get_terminal_size().columns
subject, clazz, school = input("Введіть <предмета клас номер_школи>:\n").split()
full_name = input("Введіть <Прізвища Ім'я>:\n")
print( ("Зошит".center(c)+"\n") + ("для робіт".center(c)+'\n') + (("з "+subject).center(c)+'\n') + (("учня "+clazz+" класу").center(c)+'\n') + (("спеціалізованої школи №"+school).center(c)+'\n') + ("м. Києва".center(c)+'\n') + full_name.center(c) )
