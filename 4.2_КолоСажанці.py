import math
r = float(input("Введіть радіус кола:"))
print("Кількість сажанців: ", round(r**2*math.pi, 2), "| довжина огорожі: ", round(2*math.pi*r, 2))
