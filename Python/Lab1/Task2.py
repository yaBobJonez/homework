# Написати програму, яка в циклі обчислює суму ряду із виведенням результату суми на кожній ітерації.

while True:
    try:
        N = int(input("Введіть N: "))
    except ValueError: print("Некоректний формат введення!")
    else: break
sum = 0
for n in range(1, N+1):
    fact = 1
    for i in range(n, 1, -1):
        fact *= i
    sum += (3**n * fact) / (n**n)
    print(sum)
