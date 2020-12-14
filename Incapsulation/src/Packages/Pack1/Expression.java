package Packages.Pack1;

public class Expression {
    private static double a = 2, b = 3;
    private double x;
    public Expression(double x) {
        this.x = x;
    }
    public double eval(){
        if(this.x > 2) return 3 * this.a * this.x;
        else return Math.pow(this.b, 2) - this.a / this.x;
    }
}
