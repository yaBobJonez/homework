package FractionsCalculator;

public class Fraction {
	public int numerator, denominator;
	public Fraction(int t, int b){
		this.numerator = t;
		if(b == 0) throw new ArithmeticException("Нельзя делить на ноль.");
		this.denominator = b;
	}
	public Fraction(){
		this.numerator = 0;
		this.denominator = 1;
	}
}
