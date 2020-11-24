package Statics;

public class Main {
	int b = 10;
	static int c = 30;
	public static void main(String[] args) {
		int a = 20;
		System.out.println(a);
		Main main = new Main();
		System.out.println(main.b);
		System.out.println(c);
	}
	void display(){
		System.out.println(b);
		System.out.println(c);
	}
}
