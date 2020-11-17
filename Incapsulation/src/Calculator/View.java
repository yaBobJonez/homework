package Calculator;

public class View {
    public void display(int res){
        System.out.println(res);
    }
    public void display(double res){
        System.out.println(res);
    }
    public void display(String mes, int res){
        System.out.println(mes + res);
    }
    public void display(String mes, double res){
        System.out.println(mes + res);
    }
}
