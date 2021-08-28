package Divisors;

import Common.IntArray;
import Common.Input;

public class Main {
    public static void main(String[] args) {
        int num = Input.inputInt("Введите число:");
        IntArray divisors = new IntArray();
        int i = 0;
        while(++i <= num) if(num % i == 0) divisors.add(i);
        System.out.println("Делители числа " + num + ": " + divisors.toString());
    }
}
