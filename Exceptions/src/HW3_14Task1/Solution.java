package HW3_14Task1;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;

public class Solution{
	public static void main(String[] args) throws ArithmeticException, URISyntaxException {
		try { method1(); }
		catch(NullPointerException | FileNotFoundException e){
			System.out.println("RuntimeException : " + e.getClass().getSimpleName());
		}
		/*
		 * NullPointer : Runtime
		 * FileNotFound : Exception
		 * ^ нужные исключения унаследованы от разных классов, поэтому оператором '|' улавливаем конкретные исключения.
		 * Другой вариант мог быть таким:
		 * catch(Exception e){
		 *     if(e instanceof <...>) ...;
		 *     ...
		 *     else throw e;
		 * }
		 */
	}
	public static void method1() throws NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException {
		int i = (int)(Math.random() * 4);
		if (i == 0) throw new NullPointerException();
		else if (i == 1) throw new ArithmeticException();
		else if (i == 2) throw new FileNotFoundException();
		else if (i == 3) throw new URISyntaxException("undefined", "null");
	}
}