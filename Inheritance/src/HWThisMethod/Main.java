package HWThisMethod;

public class Main {
	public static void main(String[] args) {
		MyClass mc1 = new MyClass();
		MyClass mc2 = new MyClass(2);
		MyClass mc3 = new MyClass(4, 8);
		System.out.println(mc1);
		System.out.println(mc2);
		System.out.println(mc3);
	}
}
