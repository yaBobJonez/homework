import os.path
import sys
from locale import getpreferredencoding

ifn = input("Введіть шлях до файлу з текстом: ")
ofn = input("Введіть шлях вихідного файлу: ")
ifn = os.path.abspath(ifn)
ofn = os.path.abspath(ofn)
if not os.path.isfile(ifn):
    print(f"Неможливо знайти файл {ifn}.", file=sys.stderr)
    exit(1)
fd = os.open(ifn, os.O_RDONLY)
text = os.read(fd, 2_147_483_647).decode(getpreferredencoding())
os.close(fd)
words = [word.upper() if len(word) > 2 else word for word in text.split()]
text = " ".join(words)
if os.path.exists(ofn):
    print(f"Файл {ofn} вже існує.", file=sys.stderr)
    exit(1)
fd = os.open(ofn, os.O_CREAT | os.O_WRONLY)
os.write(fd, text.encode(getpreferredencoding()))
os.close(fd)
print("Успішно записано.")
