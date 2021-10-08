from math import sqrt
from commons import commonMDI

def task1():
	a, b, c = [int(x) for x in input("Введіть <a b c>:\n> ").split()]
	if a < b+c and b < a+c and c < a+b:
		p = (a+b+c)/2
		print("Такий трикутник існує; площа: {}".format( round(sqrt(p*(p-a)*(p-b)*(p-c)), 2) ))
	else: print("Такий трикутник бути не може.")
def task2():
	num = int(input("Введіть число:\n> "))
	digits = [int(i) for i in str(num)]
	if digits.count(digits[0]) == len(digits): print("Однакові цифри у числі.")
	else: print("Цифри різні.")
def task3():
	num = int(input("Введіть число:\n> "))
	print(str(num)[::-1])
def task4():
	num = int(input("Введіть число:\n> "))
	last = num % 10
	# 1 гривня; 2,3,4 гривні; 5..0 гривень
	if last in [2, 3, 4]: print(num, "гривні")
	elif last == 1: print(num, "гривня")
	else: print(num, "гривень.")
def task5():
	v = float(input("Введіть швидкість:\n> "))
	if v < 7.8: print("Апарат впаде на землю.")
	elif v >= 7.8 and v < 11.2: print("Апарат стане супутником Землі.")
	elif v >= 11.2 and v < 16.4: print("Апарат стане супутником Сонця.")
	else: print("Апарат покине Сонячну систему.")

menu = ["1. Трикутники", "2. Чи однакові цифри?", "3. Число перегорнуте", "4. Гривні", "5. Канаверал", "Вийти"]
task = commonMDI.open(menu)
if task != len(menu)-1:
	locals()["task"+str(task+1)]()
exit()
