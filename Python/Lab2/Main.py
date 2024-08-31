import sys

text = input("Введіть текст:\n")
try:
    if ' ' not in text: raise RuntimeError("Текст не містить пробілів.")
    print("До:", text)
    count = 0
    while "  " in text:
        count += 1
        text = text.replace("  ", ' ', 1)
    last = count % 10
    ending = "" if last == 1 else "и" if last in [2,3,4] else "ів"
    print("Після:", text)
    print(f"Видалено {count} пробіл{ending}.")
except RuntimeError as e:
    print(e, file=sys.stderr)
