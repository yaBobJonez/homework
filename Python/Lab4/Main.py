import re
import sys

from Square import Square
from Disc import Disc

def input_point(ordinal: str):
    while True:
        instr = input(f"Введіть {ordinal} точку: ")
        pat = r'\(?\s*([+-]?\d+(\.\d+)?)\s*[;,|]\s*([+-]?\d+(\.\d+)?)\s*\)?'
        if match := re.search(pat, instr.strip()):
            return float(match.group(1)), float(match.group(3))
def input_radius():
    while True:
        try: return float(input("Введіть радіус: "))
        except ValueError: continue
        else: break

print("-=-= Квадрат =-=-")
print("Формат введення: (? число [;,|] число )?")
p1 = input_point("першу")
p2 = input_point("другу")
square = Square(p1, p2)
print("Площа квадрата: %.3f" % square.calculate_area())
print("Периметр квадрата: %.3f" % square.calculate_perimeter())

print("-=-= Круг =-=-")
r = input_radius()
try:
    disc = Disc(r)
    print("Площа круга: %.3f" % disc.calculate_area())
    print("Периметр круга: %.3f" % disc.calculate_perimeter())
except ValueError as e:
    print(e, file=sys.stderr)
