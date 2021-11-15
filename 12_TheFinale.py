from tkinter import *
from tkinter import ttk
from tkinter import messagebox
from random import randint

tries = 0
gen = [randint(0, 9), randint(0, 9), randint(0, 9), randint(0, 9)]

def attempt(*args):
	global tries; global gen
	if len(num.get()) != 4 or not num.get().isnumeric():
		messagebox.showinfo(message="Введіть 4-значне число.", title="Помилка вводу")
		return
	bulls.set(0); cattles.set(0)
	guess = [int(i) for i in list(str(num.get()))]
	for i in range(4):
		if gen[i] == guess[i]: bulls.set( str(int(bulls.get())+1) )
		elif guess[i] in gen: cattles.set(str(int(cattles.get())+1))
	if int(bulls.get()) == 4:
		msg = "Вам знадобилося "+str(tries)+" спроб."
		messagebox.showinfo(message="Ви виграли!", detail=msg, title="Кінець гри")
		exit(0)
	tries += 1
	if tries > 10:
		messagebox.showinfo(message="Ви програли :(", title="Кінець гри")
		exit(0)

root = Tk()
root.title("Бики та Корови")
root.eval('tk::PlaceWindow . center')
mainframe = ttk.Frame(root, padding="5 5 5 5")
mainframe.grid(column=0, row=0, sticky=(N, W, E, S))
root.columnconfigure(0, weight=1)
root.rowconfigure(0, weight=1)

ttk.Label(mainframe, text="Я загадав 4-х значне число. Вгадуйте!").grid(column=1, row=1, sticky=(W, E, S), columnspan=2)

num = StringVar()
ttk.Entry(mainframe, textvariable=num).grid(column=1, row=2, sticky=(W, E, N, S), columnspan=2)

ttk.Label(mainframe, text="Биків: ").grid(column=1, row=3, sticky=(W, N, S))
bulls = StringVar(); bulls.set(0)
ttk.Label(mainframe, textvariable=bulls).grid(column=2, row=3, sticky=(E, N, S))

ttk.Label(mainframe, text="Корів: ").grid(column=1, row=4, sticky=(W, N, S))
cattles = StringVar(); cattles.set(0)
ttk.Label(mainframe, textvariable=cattles).grid(column=2, row=4, sticky=(E, N, S))

ttk.Button(mainframe, text="Спробувати", command=attempt).grid(column=1, row=5, sticky=(W, E, N), columnspan=2)

for child in mainframe.winfo_children(): 
	child.grid_configure(padx=5, pady=5)
root.bind("<Return>", attempt)
root.mainloop()
