from commons import commonMDI
import random

def task1():
	arr1 = [3, 4, 5, 1, 87, 16]
	arr2 = [i*i for i in range(1, 17)]
	del arr1[1]
	print(arr1)
	arr2[-1] = 621
	print(arr2)
	arr3 = arr1 + arr2
	print(arr3)
	arr4 = arr3[3:12]
	print(arr4)
	arr4.insert(0, "Un stylo")
	arr4.append("français")
	print(arr4)
def task2():
	arr = [float(i) for i in input("Введіть 8 чисел:\n> ").split()]
	print("Сума:", sum(arr))
	print("Максимум:", max(arr))
	print("Мінімум:", min(arr))
def task3():
	arr = [random.randint(0, 101) for i in range(100)]
	arrCuts = [arr[i:i + 10] for i in range(0, len(arr), 10)]
	for i in arrCuts: print(i) #Навіщо окрема функція для виводу списка,
	for i in arrCuts: i.sort() #якщо можна просто print()?
	arrCuts.sort()
	for i in arrCuts: print(i)

menu = ["1", "2", "3", "Вийти"]
task = commonMDI.open(menu)
if task != len(menu)-1:
	locals()["task"+str(task+1)]()
exit()
