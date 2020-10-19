package Line2;

//Получить трёхзначное число от пользователя, разделить его на разряды, и перевернуть.

import yaBobJonez.Input;

public class Lesson_1 {
    public static void main(String[] args) throws Exception {
        int num = Input.inputInt("Введите трёхзначное число:");
        if(String.valueOf(num).length() != 3) { System.err.println("Число должно быть трёхзначным!"); System.exit(0); }
        int a3 = num % 10;
        int a2 = num / 10 % 10;
        int a1 = num / 100;
        System.out.println(String.valueOf(a3) + a2 + a1);
    }
}