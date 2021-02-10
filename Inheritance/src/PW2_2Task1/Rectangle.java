package PW2_2Task1;

public class Rectangle extends Shape {
	protected int a, b;
	protected String name;
	
	public Rectangle(int p, float s, int a, int b, String name) {
		super(p, s);
		this.a = a;
		this.b = b;
		this.name = name;
	} public Rectangle(int a, int b, String name) {
		super(0, 0);
		this.a = a;
		this.b = b;
		this.name = name;
	}
	/*
	 * Методы-"генераторы" (не требуют кастинга, возвращают инстанцию своего класса).
	 */
	protected static Rectangle of(){
		return new Rectangle(0, 0, "");
	} protected static Rectangle of(int a, int b, String name){
		return new Rectangle(0, 0, a, b, name);
	} protected static Rectangle of(int P, float S, int a, int b, String name){
		return new Rectangle(P, S, a, b, name);
	}
	@Override
	protected int getP(){
		return 2 * this.a + 2 * this.b;
	} @Override
	protected float getS(){
		return this.a * this.b;
	}
}
