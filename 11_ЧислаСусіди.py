from commons import commonMDI
from math import copysign

def task1():
	arr = [int(x) for x in input("Введіть список чисел:\n> ").split()]
	for i in range(len(arr)-1):
		if arr[i+1] > arr[i]: print(arr[i+1])
def task2():
	arr = [int(x) for x in input("Введіть список чисел:\n> ").split()]
	greaterThanNeighboringNumbers = []
	for i in range(1, len(arr)-1):
		if (arr[i] > arr[i-1]) and (arr[i] > arr[i+1]):
			greaterThanNeighboringNumbers.append(arr[i])
	print("Кількість чисел:", len(greaterThanNeighboringNumbers))
	print(greaterThanNeighboringNumbers)
def task3():
	arr = [int(x) for x in input("Введіть список чисел:\n> ").split()]
	for i in range(len(arr)-1):
		if copysign(1, arr[i]) == copysign(1, arr[i+1]):
			print(arr[i], arr[i+1])
def task4():
	arr = [int(x) for x in input("Введіть послідовність чисел:\n> ").split()]
	if all(i <= j for i, j in zip(arr, arr[1:])):
		print("Послідовність неспадна.")
	else: print("Послідовність спадна!")

menu = ["1", "2", "3", "4", "Вийти"]
task = commonMDI.open(menu)
if task != len(menu)-1:
	locals()["task"+str(task+1)]()
exit()
