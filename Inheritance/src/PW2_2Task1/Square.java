package PW2_2Task1;

public class Square extends Shape {
	protected int size;
	protected String name;
	
	public Square(int p, float s, int size, String name) {
		super(p, s);
		this.size = size;
		this.name = name;
	} public Square(int size, String name) {
		super(0, 0);
		this.size = size;
		this.name = name;
	}
	/*
	 * "Сырые" методы-"генераторы" (требуют кастинга, ведь возвращают родительский клас).
	 */
	protected static Shape of(){
		return new Square(0, "");
	} protected static Shape of(int size, String name){
		return new Square(0, 0, size, name);
	} protected static Shape of(int P, float S, int size, String name){
		return new Square(P, S, size, name);
	}
	@Override
	protected int getP(){
		return 4 * this.size;
	} @Override
	protected float getS(){
		return (float)Math.pow(this.size, 2);
	}
}
