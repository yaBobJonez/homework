from matplotlib import pyplot as plt
import numpy as np

x = np.arange(-5, 5.05, 0.05)
y1 = np.abs(x)
y2 = x**3
y3 = (1/3)**x

plt.plot(x, y1, 'r--', label="y = |x|")
plt.plot(x, y2, 'g-.', label="y = x³")
plt.plot(x, y3, 'b:', label="y = ⅓^x")
plt.legend(loc="lower right")
plt.xlabel("x", color='b', fontsize=12)
plt.ylabel("y", color='b', fontsize=12)
plt.title("Графіки математичних функцій", color='r', fontsize=16)
plt.savefig("task3.png")
plt.savefig("task3.pdf")
