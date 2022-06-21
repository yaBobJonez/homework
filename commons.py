"""
MIT License

Copyright (c) 2021 Mykhailo Stetsiuk

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
"""

import curses
"""
(Py)Commons
— мікро-модуль, створений для легкого створення консольних
Меню Інтерфейсів через ncurses.
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

