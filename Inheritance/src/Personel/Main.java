package Personel;

import static Common.Output.print;

public class Main {
	public static void main(String[] args) {
		print(new Person());
		print(new Person("Shawn"));
		print(new Person("Jay", 8));
	}
}
