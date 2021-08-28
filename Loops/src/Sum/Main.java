package Sum;

import Common.Input;
import Common.Output;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i <= 5; i++) sum += Input.inputInt("Введите "+i+"-е число:");
        Output.print("Сумма: " + sum);
    }
}
