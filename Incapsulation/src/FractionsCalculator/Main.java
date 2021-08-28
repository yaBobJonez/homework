package FractionsCalculator;

import Common.Input;

public class Main {
	public static void main(String[] args) {
		int f1n = Input.inputInt("Введите числитель 1-й дроби:");
		int f1d = Input.inputInt("Введите знаменатель 1-й дроби:");
		Fraction f1 = new Fraction(f1n, f1d);
		int f2n = Input.inputInt("Введите числитель 2-й дроби:");
		int f2d = Input.inputInt("Введите знаменатель 2-й дроби:");
		Fraction f2 = new Fraction(f2n, f2d);
		
		Fraction stage1 = Calculator.add(f1, f2);
		Fraction stage2 = Calculator.reduce(stage1);
		
		View.display(stage2);
	}
}
