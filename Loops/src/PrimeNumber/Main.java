package PrimeNumber;

import yaBobJonez.Input;
import yaBobJonez.Output;

public class Main {
    public static void main(String[] args) {
        int num = Input.inputInt("Введите число:");
        boolean isDivisibleBy1AndSelf = (num % num == 0 && num % 1 == 0)? true : false;
        if(isDivisibleBy1AndSelf) {
            for(int i = 2; i < num; i++) if(num % i == 0){ isDivisibleBy1AndSelf = false; break; }
            Output.print("Число " + num + ( isDivisibleBy1AndSelf? " есть " : " не являеться ") + "простым.");
        } else {
            Output.print("Число " + num + "не являеться простым.");
        }
    }
}
