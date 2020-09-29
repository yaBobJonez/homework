package Lesson6;

import SharedUtils.Input;

public class Main {
    public static void main(String[] args) {
        int x = Input.inputInt("Введите x:");
        int y = Input.inputInt("Введите y:");
        boolean c1 = Math.pow(x, 2) + Math.pow(x, 2) <= 4;
        boolean c3 = (x >= 0) & (Math.pow(y, 2) != 0);
        boolean c5 = (x * y != 0) & (y > x);
        System.out.println(""+ c1 + " " + c3 + " " + c5);
    }
}
