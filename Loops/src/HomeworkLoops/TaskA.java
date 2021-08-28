package HomeworkLoops;

import Common.Input;
import Common.Output;

public class TaskA {
	public static void main(String[] args) {
		//Задача 11 (первая):
		
		//Первый вариант (универсальный):
		advanced();
		//Второй вариант (по программе):
		//simple();
	}
	public static void advanced(){
		for(int group = 1; group <= 2; group++){
			double sum = 0;
			double[] students = Input.inputDoubleArray("Введите возраст учеников "+group+"-й группы (через пробелы):");
			for(double age : students) sum += age;
			double average = Math.round(sum / students.length * 100.0) / 100.0;
			System.out.println("Средний возраст группы: " + average + "\n");
		}
	}
	public static void simple(){
		for (int group = 1; group <= 2; group++) {
			double sum = 0;
			for(int i = 1; i <= 12; i++){
				sum += Input.inputDouble("Введите возраст "+i+"-го ученика:");
			} Output.print("Средний возраст "+group+"-й группы: " + sum / 12 + "\n");
		}
	}
}
