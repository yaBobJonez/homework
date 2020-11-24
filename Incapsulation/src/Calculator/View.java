package Calculator;

import java.text.DecimalFormat;

public class View {
    public static void display(double res){
    	String formatted = new DecimalFormat("0.########").format(res);
    	System.out.println(formatted);
    }
    public static void display(String mes, double res){
        String formatted = new DecimalFormat("0.########").format(res);
    	System.out.println(mes + formatted);
    }
}
