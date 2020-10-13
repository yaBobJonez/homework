package Lesson7;

import SharedUtils.Input;

public class Main {
    public static void main(String[] args) {
        int a = Input.inputInt("Введите число А:");
        //a)
        if((a % 2 == 0) || (a % 3 == 0)) System.out.println("Это число кратное 2-м или 3-м.");
        else System.out.println("Это число НЕ кратное 2-м или 3-м.");
        //b)
        char lastDigit = String.valueOf(a).charAt(String.valueOf(a).length() - 1);
        if((a % 3 != 3) & (lastDigit == '0'))
            System.out.println("Это число НЕ кратно 3 и оканчиваеться нулём.");
        else System.out.println("Это число не соответствует критериям.");
    }
}
