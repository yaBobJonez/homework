package Lesson101;

public class Main {
    public static void main(String[] args) {
        System.out.println("Try this:");
        try{
            System.out.println("HERE!");
            System.out.println(5/0);
            System.out.println("Not gonna do it to here...");
        } catch(ArithmeticException e){
            System.out.println("Жанна не научила, да, шкила?!?!!1!");
            System.out.println("Посмотри, что вы наделали!!:\n");
            //for(StackTraceElement trace : e.getStackTrace()) System.out.println(trace);
            System.out.println(e.getSuppressed());
        } finally {
            System.out.println("\nВ любом случае что-то тут да буде, на чотiри бала...");
        }
        System.out.println("Why am I here, just to suffer?..");
        int[] numbers = {1, 4, -7, 2};
        try{
            System.out.println(numbers[10]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Ææææææææ...");
        }
    }
}

