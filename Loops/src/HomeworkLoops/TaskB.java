package HomeworkLoops;

import java.util.Scanner;

import yaBobJonez.Input;

public class TaskB {
	public static void main(String[] args) {
		//Задача 3 (номер ПК 11 - 8) (вторая):
		
		//Первый вариант (упрощённый):
		//advanced();
		//Второй вариант (по программе):
		simple();
	}
	private static void advanced(){
		int[] nums = Input.inputIntArray("Введите числа (через пробелы):");
		int sum = 0;
		for(int num : nums) sum += num;
		System.out.println("Среднее арифметическое: " + sum / nums.length);
	}
	private static void simple(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите колличество чисел N:");
		int n = sc.nextInt();
		int sum = 0;
		for(int i = 1; i <= n; i++){
			System.out.println("Введите "+i+"-e число:");
			sum += sc.nextInt();
		} System.out.println("Среднее арифметическое: " + sum / n);
	}
}
