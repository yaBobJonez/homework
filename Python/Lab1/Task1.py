# Написати програму порівняння двох чисел.

while True:
    try:
        a = float(input("Введіть число a: "))
        b = float(input("Введіть число b: "))
    except ValueError: print("Некоректний формат введення!")
    else: break
if a < b: print(a, '<', b)
elif a > b: print(a, '>', b)
else: print(a, '=', b)
'''
# Інший варіант:
comp = '<' if a < b else '>' if a > b else '='
print(a, comp, b)
# Ще один варіант:
print(
    "a = b" if a == b
    else "a < b" if a < b
    else "a > b"
)
'''
