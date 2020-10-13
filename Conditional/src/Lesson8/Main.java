package Lesson8;

import SharedUtils.Input;
import SharedUtils.Output;

public class Main {
    public static void main(String[] args) {
        try {
            //Без сохранения переменной
            int num = Input.inputInt("Введите число:");
            System.out.println((num % 2 == 0)? "Чётное число." : "Нечётное число.");

            //С сохранением переменной
            int b = Input.inputInt("Введите число:");
            String s = (b % 2 == 0)? "Чётное число." : "Нечётное число.";
            System.out.println(s);
        } catch(Exception e){ System.err.println("Число слишком большое или слишком маленькое!"); }
    }
}
