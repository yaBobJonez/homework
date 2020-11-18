package Task_Circle;

import yaBobJonez.Output;

public class Main {
	public static void main(String[] args) {
		Circle circle = new Circle(3, 6);
		circle.print();
		circle.r = 13.4;
		circle.expand(4.6);
		circle.print();
		Output.print(circle.area());
		Output.print(circle.circumference());
	}
}
