# Написати програму, яка виконує цілочисельне ділення натуральних чисел через операцію
# віднімання, не використовуючи операцію ділення.

while True:
    try:
        a = int(input("Ділене: "))
        b = int(input("Дільник: "))
        if a <= 0 or b <= 0: raise ValueError
    except ValueError: print("Некоректні вхідні дані!")
    else: break
quotient = 0
while a >= b:
    a -= b
    quotient += 1
print("Частка:", quotient)
