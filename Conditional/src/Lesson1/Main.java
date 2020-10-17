package Lesson1;

import yaBobJonez.Input;

public class Main {
    public static void main(String[] args) {
        int a = Input.inputInt("Введите число a:");
        int b = Input.inputInt("Введите число b:");
        System.out.println("a > b? " + (a > b));
    }
}
