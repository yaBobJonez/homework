package Task_Circle;

import java.text.DecimalFormat;
import java.util.Formatter;

public class Circle {
	public double x;
	public double y;
	public double r;
	private final double PI = Math.PI;
	public Circle() {}
	public Circle(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public Circle(double x, double y, double r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}
	public void print(){
		System.out.printf("(%.1f; %.1f) = %.1f\n", this.x, this.y, this.r);
	}
	public void move(double x, double y){
		this.x += x;
		this.y += y;
	}
	public void expand(double k){
		this.r *= k;
	}
	public double area(){
		double area = this.PI * Math.pow(this.r, 2);
		DecimalFormat df = new DecimalFormat("#.##");
		return Double.parseDouble(df.format(area));
	}
	public double circumference(){
		double circumference = 2 * this.PI * this.r;
		DecimalFormat df = new DecimalFormat("#.##");
		return Double.parseDouble(df.format(circumference));
	}
}
