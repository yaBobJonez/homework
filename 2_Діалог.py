import datetime

print("Привіт,", input("(Введіть ім'я)\n")+".")
year = datetime.datetime.now().year
yearOfBirth = input("У якому році ви народилися?\n")
age = year - int(yearOfBirth)
if age <= 0:
	print("Ви не могли ще не народитися! xD")
elif age < 6:
	print("Менше шести років, а вже користуєтесь ком'ютером? :O")
else:
	print("Добре, вам", age, "років.")
clazz = input("У якому класі ви навчаєтесь?\n")
if int(clazz) <= 4:
	print("Ще молодша школа? Успіхів у навчанні!")
elif int(clazz) >= 10:
	print("Бажаю вам гарно скласти ЗНО!")
else:
	print("Добре, гарного навчання.")
print(input("Що ви любите робити?\n").capitalize(), " - це добре.")
