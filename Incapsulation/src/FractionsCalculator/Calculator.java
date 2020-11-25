package FractionsCalculator;

public class Calculator {
	public static Fraction add(Fraction f1, Fraction f2){
		return new Fraction(f1.numerator + f2.numerator, f1.denominator * f2.denominator);
	}
	public static Fraction subtract(Fraction f1, Fraction f2){
		return new Fraction(f1.numerator - f2.numerator, f1.denominator * f2.denominator);
	}
	public static Fraction multiply(Fraction f1, Fraction f2){
		return new Fraction(f1.numerator * f2.numerator, f1.denominator * f2.denominator);
	}
	public static Fraction divide(Fraction f1, Fraction f2){
		return new Fraction(f1.numerator * f2.denominator, f2.denominator * f1.numerator);
	}
	public static Fraction reduce(Fraction f){
	    int GCD = GCD(f.numerator, f.denominator);
		return new Fraction(f.numerator / GCD, f.denominator / GCD);
	}
	private static int GCD(int a, int b){
	    return b == 0 ? a : GCD(b, a % b);
	}
}
