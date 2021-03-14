package HW3_14Task3;

public class Solution {
	public static void main(String[] args) {
		processExceptions(new Solution());
	}
	public static void processExceptions(Solution obj) {
		try {
			obj.method1(); //Код остановится на первом же исключении, как "вывести каждое"?
			obj.method2();
			obj.method3();
		} catch(Exception e){
			Solution.printStack(e);
		}
	}
	public static void printStack(Throwable throwable) {
		//System.out.println(throwable); Я заменю эту строку лучше на такую: (ниже), хорошо? ;)
		System.err.println(throwable.getClass().getSimpleName() + ", вот Stack Trace:");
		/* 
		 * Можно было бы сделать так:
		 * throwable.printStackTrace();
		 * Но тогда выводить имя исключения бесполезно (повторялось бы), поэтому циклом:
		 */
		for(StackTraceElement e : throwable.getStackTrace()) System.err.println("\t" + e);
		//Заметка: '\t' это Таб, чисто для вида.
	}
	public void method1() {
		throw new NullPointerException();
	}
	public void method2() {
		throw new ArithmeticException();
	}
	public void method3() {
		throw new ArrayIndexOutOfBoundsException();
	}
	public void method4() { //В условии дано 4 исключения, но 3 метода, поэтому я дописал ещё один.
		throw new ClassCastException();
	}
}