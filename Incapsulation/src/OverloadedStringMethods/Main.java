package OverloadedStringMethods;

import Common.Output;

public class Main {
	public static void main(String[] args) {
		String str = "Java is not that complicated.";
		Output.print(str.indexOf('a'));
		Output.print(str.indexOf('a', 2));
		Output.print(str.indexOf("not"));
		modify(40, 34);
		modify(56.5, 7.2);
		modify(40, 7.2);
		modify(56.5, 34);
	}
	static void modify(int a, int b){ Output.print(a+b); }
	static void modify(double a, double b){ Output.print(a-b); }
	static void modify(int a, double b){ Output.print(a-b); }
	static void modify(double a, int b){ Output.print(a-b); }
}
