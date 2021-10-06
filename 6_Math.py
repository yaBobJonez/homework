from math import sqrt, pow, pi, log10, log, e, tan
from commons import commonMDI

def task1():
	a, b = [float(x) for x in input("Введіть <a b>:\n> ").split()]
	y = (a/b + 5.6*sqrt(3))/(pow(b, 2) + 2*a)
	print(y)
def task2():
	x, a, b = [float(v) for v in input("Введіть <x a b>:\n> ").split()]
	y = sqrt(pow(x, 2)) + sqrt(sqrt((a+b)/2))
	print(y)
def task3():
	a, b = [float(x) for x in input("Введіть <a b>:\n> ").split()]
	y = (pow(a, 4)+3.3)*sqrt(3) + sqrt(sqrt(7+b))
	print(y)
def task4():
	x, y = [float(v) for v in input("Введіть <x y>:\n> ").split()]
	z = (pow(y, 2)*log10(x))/(x*log(pow(y, 2)+1, e))
	print(z)
def task5():
	a = float(input("Введіть <a>:\n> "))
	z = ( pow(tan(2*a - pi/4), 2)-1 )/( pow(tan(2*a - 5/4*pi), 2)+1 )
	print(z)

menu = ["1", "2", "3", "4", "5", "ВИЙДИ АТСЮДА, РОЗБІЙНИК"]
task = commonMDI.open(menu)
if task != len(menu)-1:
	locals()["task"+str(task+1)]()
exit()
