package Recursion1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Вывод чисел рекурсией:");
        System.out.println(rowFrom1(10));
        System.out.println("Вывод факториала:");
        System.out.println(factorial(5));
    }
    public static String rowFrom1(int i){
        if(i == 1) return "1";
        return rowFrom1(i-1) + " " + i;
    }
    public static int factorial(int i){
        if(i == 1) return 1;
        return i * factorial(i-1);
    }
}
