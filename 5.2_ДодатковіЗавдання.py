from commons import commonMDI
from time import sleep
from sys import stderr

def task1():
	squifs = int(input("Кількість вивірок?\n> "))
	nutz = int(input("Кількість горіхів?\n> "))
	if nutz < squifs:
		print("Е, горіхів замало, ти чьо?", file=stderr) #raise Exception тут менш підходило б, я думаю...
		exit()
	print("Кожній білці — "+str(nutz//squifs), "| остача: "+str(nutz%squifs))
def task2():
	x, y, z, n = [int(x) for x in input("Введіть <x, y, z, n>:\n> ").split()]
	print("Всього дописів: ", x+y+(n-2)*z) # n-2 тому, що x, y ∊ n
def task3():
	primary = float(input("Скільки заробив Петрик?\n> "))
	print("Сашко заробив:", round((primary*0.6)*0.9, 2))
def task4():
	a, b = 1500, 2500
	aIncr, bIncr = [int(v) for v in input("Введіть <x y>:\n> ").split()]
	joursPasses = 0
	if aIncr <= bIncr:
		print("Умова не може бути виконаною за таких значень.", file=stderr)
		exit()
	while a < b:
		a += aIncr*100; b += bIncr*100 #Не-Пайтоновська крапка з комою ;)
		joursPasses += 1
	print("Відповідь: за {} днів.".format(joursPasses))
def task5():
	x, y, z = [float(v) for v in input("Введіть <години_до_зустрічі Vвело Vмото>:\n> ").split()]
	print("Розв'язання:")
	sleep(2)
	print("Велосипедист за 1 годину проїхав {} км...".format(y))
	sleep(2)
	print("Велосипедист за {} годин(у,и) проїхав ще {} км...".format(x, x*y))
	sleep(2)
	print("За цей час мотоцикліст за {} годин(у,и) проїхав {} км...".format(x, x*z))
	sleep(2)
	print("{}×({}+{}) + {} = {} — відповідь.".format(x, y, z, y, x*(y+z)+y))
def task6():
	"""
	В одну посудину було налито 1 л молока, в іншу — 1 л води. З першої посудини у другу перелили склянку молока ємністю t мл, а потім таку ж склянку розчину, отриманого в другій посудині, перелили назад у першу. Скільки мілілітрів молока в результаті вийшло в розчинах з першої та другої посудин?
	"""
	a = {"Water": 0, "Milk": 1000}; b = {"Water": 1000, "Milk": 0}
	t = int(input("Введіть об'єм склянки (ml):\n> "))
	a["Milk"] -= t; b["Milk"] += t
	perc = {"Water": b["Water"]/(b["Water"]+b["Milk"]), "Milk": b["Milk"]/(b["Water"]+b["Milk"])}
	a["Water"] += t*perc["Water"]; a["Milk"] += t*perc["Milk"]
	b["Water"] -= t*perc["Water"]; b["Milk"] -= t*perc["Milk"]
	print("У першій посудині: {} ml води, {} ml молока.".format(round(a["Water"]), round(a["Milk"])))
	print("У другій посудині: {} ml води, {} ml молока.".format(round(b["Water"]), round(b["Milk"])))
def task7():
	a, k, expected = [int(x) for x in input("Введіть <a k n>:\n> ").split()]
	current = a**2/k
	if current < expected:
		print("Не вистачає {} m² на кожного Робінзона (всього не вистачає {} m²).".format(expected-current, (expected-current)*k), file=stderr)
	else: print("Вистачає площі всім.")

menu = ["1. Вивірки та горіхи", "2. Соціальні мережі", "3. Заробіток на YouTube", "4. Котлети :P", "5. A.distanceTo(B)", "6. Молоко та вода", "7. Робінзони", "0. Вийти"]
task = commonMDI.open(menu)
if task != len(menu)-1:
	locals()["task"+str(task+1)]()
exit()

