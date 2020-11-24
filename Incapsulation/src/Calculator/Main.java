package Calculator;

public class Main {
    public static void main(String[] args) {
        Model model1 = new Model(50, 12);
        double sum = Controller.add(model1);
        View.display("Сумма: ", sum);

        Model model2 = new Model();
        model2.x = 10; model2.y = 45;
        double subtraction = Controller.subtract(model2);
        View.display("Отнимание: ", subtraction);

        Model model3 = new Model(12, 6);
        View.display("Умножение: ", Controller.multiply(model3));

        Model model4 = new Model(621, 69.2);
        View.display("Деление: ", Controller.divide(model4));

        Model model5 = new Model(420, 69);
        View.display("Модуло: ", Controller.modulo(model5));
    }
}
