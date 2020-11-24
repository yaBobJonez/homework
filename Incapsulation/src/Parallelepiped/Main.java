package Parallelepiped;

public class Main {
	public static void main(String[] args) {
		Parallelepiped parallelepiped = new Parallelepiped(56, 34, 12);
		Evaluator calc = new Evaluator();
		Display display = new Display();
		int area = calc.area(parallelepiped.l, parallelepiped.w, parallelepiped.h);
		int volume = calc.volume(parallelepiped.l, parallelepiped.w, parallelepiped.h);
		display.print(area, volume);
	}
}
