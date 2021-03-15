package PW3_15Task3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int[] m = {-1, 0, 1};
		try {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			m[a] = 4/a;
			System.out.println(m[a]);
		} catch(ArithmeticException e){
			System.out.println("ArithmeticException");
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBoundsException");
		} catch(InputMismatchException e){
			System.out.println("InputMismatchException");
		}
	}
}
