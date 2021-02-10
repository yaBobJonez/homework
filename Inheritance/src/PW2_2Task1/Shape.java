package PW2_2Task1;

public class Shape {
	protected int P;
	protected float S;
	
	public Shape(int p, float s) {
		P = p;
		S = s;
	}
	/*
	 * Методы-"генераторы".
	 */
	protected static Shape of(){
		return new Shape(0, 0);
	} protected static Shape of(int P, float S){
		return new Shape(P, S);
	}
	
	/*
	 * Эти методы будут перезаписываться в наследниках (Полиморфизм).
	 */
	protected int getP(){
		return this.P;
	} protected float getS(){
		return this.S;
	}
}
