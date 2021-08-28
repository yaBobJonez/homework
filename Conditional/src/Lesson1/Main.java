package Lesson1;

import Common.Input;

public class Main {
    public static void main(String[] args) {
        int a = Input.inputInt("Введите число a:");
        int b = Input.inputInt("Введите число b:");
        System.out.println("a > b? " + (a > b));
    }
}
