package Packages.Pack1;

public class ArithmeticProgression {
    private double n1, d;
    public ArithmeticProgression(double n1, double d) {
        this.n1 = n1;
        this.d = d;
    }
    public double getElement(int index){
        return this.n1 + (index - 1) * this.d;
    }
    public double getSum(int to){
        return (this.n1 + this.getElement(to)) / 2 * to;
    }
}