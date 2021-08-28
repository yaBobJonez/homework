package Lesson3;

import Common.Input;

public class Main {
    public static void main(String[] args) {
        int a = Input.inputInt("Введите число a:");
        int b = Input.inputInt("Введите число b:");
        int c = Input.inputInt("Введите число c:");
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        if(discriminant >= 0){
            System.out.println("Корни существуют:");
            double x1 = (-b + Math.sqrt(discriminant)) / (2*a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2*a);
            System.out.println("x1 = " + x1);
            if (x1 != x2) System.out.println("x2 = " + x2);
        } else System.out.println("Корней нет.");
    }
}
