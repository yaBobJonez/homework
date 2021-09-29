import curses

"""
(Py)Commons
— мікро-модуль, створений мною (Стецюк) для відділення великих
або часто використовуваних функцій, загальних для будь-якої
задачі. Використовується у власних скриптах, але можу дозволити
використовувати й однокласникам за їх бажанням ;D
"""
class commonMDI(object):
	@classmethod
	def _printMenu(clazz, scr, menu, selection):
		scr.clear()
		h, w = scr.getmaxyx()
		for key, value in enumerate(menu):
			x = w//2 - len(value)//2
			y = h//2 - len(menu)//2 + key
			if key == selection:
				scr.attron(curses.color_pair(1))
				scr.addstr(y, x, value)
				scr.attroff(curses.color_pair(1))
			else:
				scr.addstr(y, x, value)
		scr.refresh()
	@classmethod
	def open(clazz, menu):
		scr = curses.initscr()
		curses.start_color()
		scr.keypad(1)
		curses.curs_set(0)
		curses.noecho()
		curses.cbreak()
		curses.init_pair(1, curses.COLOR_YELLOW, curses.COLOR_BLACK)
		selected = 0
		clazz._printMenu(scr, menu, selected)
		while True:
			key = scr.getch()
			if key == curses.KEY_UP and selected > 0:
				selected -= 1
			elif key == curses.KEY_DOWN and selected < len(menu)-1:
				selected += 1
			elif key == curses.KEY_ENTER or key in [10, 13]:
				scr.keypad(0)
				curses.curs_set(1)
				curses.echo()
				curses.nocbreak()
				curses.endwin()
				return selected
			clazz._printMenu(scr, menu, selected)

