package HomeworkTernary;

import Common.Input;

public class TaskC {
	public static void main(String[] args) {
		int a = Input.inputInt("Введите сторону а:");
		int b = Input.inputInt("Введите сторону b:");
		int c = Input.inputInt("Введите сторону c:");
		boolean ab = (a + b > c)? true : false;
		boolean ac = (a + c > b)? true : false;
		boolean bc = (b + c > a)? true : false;
		boolean exists = ab & ac & bc;
		System.out.println(exists? "Да, треугольник существует." : "Нет, это невозможный треугольник.");
	}
}
