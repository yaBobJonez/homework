package Recursion2;

import SharedUtils.Utils;

public class Main {
    public static void main(String[] args) {
        int num = Utils.input("Введите число:").asInt();
        System.out.println("Сума цифр: " + sumOfDigits(num));
    }
    public static int sumOfDigits(int n){
        if(n < 10) return n;
        return n % 10 + sumOfDigits(n / 10);
    }
}
