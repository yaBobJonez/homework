from matplotlib import pyplot as plt
import numpy as np

f1 = lambda x: 5 * np.sin(1/x) * np.cos(x**2 + 1/x)**2
f2 = lambda x: 5 * np.sin(1/x) * np.cos(x**2)**3

x1 = np.arange(1, 4.05, 0.05)
y1 = f1(x1)
x2 = np.arange(-4, 4.05, 0.05)
y2 = f2(x2)

def add_plot_params():
    plt.xlabel("x", fontweight="bold", fontsize="large")
    plt.ylabel("y", fontweight="bold", fontsize="large")
    plt.legend()
    plt.grid(True)

plt.figure(1)
plt.title("Завдання 2а", color="navy", fontweight="bold", fontsize="xx-large")
plt.plot(x1, y1, color="red", label="f1")
plt.plot(x2, y2, color="green", label="f2")
add_plot_params()

plt.figure(2)
plt.title("Завдання 2б", color="navy", fontweight="bold", fontsize="xx-large")
plt.subplot(211)
plt.plot(x1, y1, color="red", label="f1")
add_plot_params()
plt.subplot(212)
plt.plot(x2, y2, color="green", label="f2")
add_plot_params()

plt.show()
