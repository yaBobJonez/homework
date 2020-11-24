package Calculator;

public class Controller {
    public static double add(Model m){ return m.x + m.y; }
    public static double subtract(Model m){ return m.x - m.y; }
    public static double multiply(Model m){ return m.x * m.y; }
    public static double divide(Model m){
    	if(m.y == 0) throw new ArithmeticException("Деление на 0");
        return m.x / m.y;
    } public static double modulo(Model m){ return m.x % m.y; }
}
