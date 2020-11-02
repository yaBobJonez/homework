package HomeworkTernary;

import yaBobJonez.Input;

public class TaskB {
	public static void main(String[] args) {
		int year = Input.inputInt("Введите год:");
		boolean isDivisibleBy100 = (year % 100 == 0)? true : false;
		boolean isLeap = isDivisibleBy100? (year % 400 == 0) : (year % 4 == 0);
		System.out.println(isLeap? "Да, год высокосный." : "Нет, год не высокосный.");
	}
}
