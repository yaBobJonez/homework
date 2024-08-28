# Написати програму, яка виконує множення натуральних чисел через операцію додавання,
# не використовуючи операцію множення.

while True:
    try:
        n = int(input("Перший множник: "))
        times = int(input("Другий множник: "))
        if n <= 0 or times <= 0: raise ValueError
    except ValueError: print("Некоректні вхідні дані!")
    else: break
product = 0
for _ in range(times):
    product += n
print("Добуток:", product)
