package PW2_2Task1;

public class Main {
	public static void main(String[] args) {
		Shape shape = Shape.of(2, 6);
		Square sq = (Square) Square.of(3, "First"); //Square возвращает Shape, кастим в Square
		Rectangle rect = Rectangle.of(5, 4, "Second"); //Rectangle возвращает себя же
		Shape rect2 = Rectangle.of(12, 3, "Third"); //Down-casting при создании
		Shape[] shapes = {shape, sq, rect, rect2};
		for(Shape s : shapes){
			//<класс>: P = <p>, S = <s>[, <имя>]
			System.out.printf("%-9s: P = %2d, S = %4.1f", s.getClass().getSimpleName(), s.getP(), s.getS());
			if(s instanceof Square) System.out.printf(", %-10s", ((Square)s).name );
			else if(s instanceof Rectangle) System.out.printf(", %-10s", ((Rectangle)s).name );
			System.out.println();
		}
	}
}
