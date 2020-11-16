package Calculator;

public class Controller {
    public int add(int a, int b){ return a + b; }
    public double add(double a, double b){ return a + b; }
    public int subtract(int a, int b){ return a - b; }
    public double subtract(double a, double b){ return a - b; }
    public int multiply(int a, int b){ return a * b; }
    public double multiply(double a, double b){ return a * b; }
    public double divide(int a, int b){
        if(b == 0) throw new ArithmeticException("Деление на 0");
        return a / b;
    } public double divide(double a, double b){
        if(b == 0) throw new ArithmeticException("Деление на 0");
        return a / b;
    } public int modulo(int a, int b){ return a % b; }
    public double modulo(double a, double b){ return a % b; }
}
