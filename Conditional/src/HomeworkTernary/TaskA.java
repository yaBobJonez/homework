package HomeworkTernary;

import yaBobJonez.Input;

public class TaskA {
	public static void main(String[] args) {
		int a = Input.inputInt("Введите сторону а:");
		int b = Input.inputInt("Введите сторону b:");
		int c = Input.inputInt("Введите сторону c:");
		boolean isIsosceles = (a == b)? true : ((a == c)? true : ((b == c)? true : false));
		System.out.print(isIsosceles? "Да, треугольник равнобедренный." : "Нет, треугольник не равнобедренный.");
	}
}
