package PW3_15Task2;

public class Dispatcher {
	public static void main(String[] args) {
		int x = 10;
		int y = 0;
		int[] a = {2, 7, 5};
		System.out.println("Started.");
		try {
			System.out.println(x/y);
			//Из-за ошибки, это не будет выведено:
			System.out.println("After dividing.");
			System.out.println(a[2]);
			System.out.println("After retrieving an element from the array.");
		} catch(ArithmeticException ae){
			System.out.println("In `catch`:");
			System.out.println(ae);
			System.out.println("Division in `catch`:");
			//Так как мы не используем вложенный `try/catch`, здесь будет ошибка. 
			System.out.println(x/y);
			System.out.println(ae);
		} finally {
			System.out.println("Finally:");
			System.out.println("Ended.");
		}
	}
}
