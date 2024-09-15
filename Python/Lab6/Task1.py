from matplotlib import pyplot as plt

x_values = [i for i in range(0, 100, 8)]
y_values = [x+2 for x in x_values]

plt.plot(x_values, y_values, color='red')
plt.title("Завдання 1", color="navy", fontweight="bold", fontsize="xx-large")
plt.xlabel("x", fontweight="bold", fontsize="large")
plt.ylabel("y", fontweight="bold", fontsize="large")
plt.legend(["y=x+2"])
plt.grid(True)
plt.show()
