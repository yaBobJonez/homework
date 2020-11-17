package Calculator;

public class Main {
    public static void main(String[] args) {
        Controller ctrl = new Controller();
        View dspl = new View();

        Model model1 = new Model(50, 12);
        int sum = ctrl.add(model1.x, model1.y);
        dspl.display("Сумма: ", sum);

        Model model2 = new Model();
        model2.x = 10; model2.y = 45;
        int subtraction = ctrl.subtract(10, 45);
        dspl.display("Отнимание: ", subtraction);

        Model model3 = new Model(12, 6);
        dspl.display("Умножение: ", ctrl.multiply(model3.x, model3.y));

        Model model4 = new Model(621, 69);
        dspl.display("Деление: ", ctrl.divide(model4.x, model4.y));

        Model model5 = new Model(420, 69);
        dspl.display("Модуло: ", ctrl.modulo(model5.x, model5.y));
    }
}
