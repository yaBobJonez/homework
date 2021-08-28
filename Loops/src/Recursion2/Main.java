package Recursion2;

import Common.Input;

public class Main {
    public static void main(String[] args) {
        int num = Input.inputInt("Введите число:");
        System.out.println("Сума цифр: " + sumOfDigits(num));
    }
    public static int sumOfDigits(int n){
        if(n < 10) return n;
        return n % 10 + sumOfDigits(n / 10);
    }
}
