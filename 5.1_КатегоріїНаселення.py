age = int(input("Скільки вам років?\n> "))
# Шкода, що тут немає switch ;(
if age < 6:
	print("Ще не школяр.")
elif age in range(6, 9):
	print("Початкова школа.")
elif age in range(10, 15):
	print("Середня школа.")
elif age in range(16, 17):
	print("Старша школа.")
else:
	print("Вже не школяр.")
