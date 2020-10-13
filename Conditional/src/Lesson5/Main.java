package Lesson5;

public class Main {
    public static void main(String[] args) {
        boolean x = false;
        boolean y = false;
        boolean z = true;
        boolean b1 = x | y & !z;
        boolean b3 = !(x & z) | y;
        boolean b5 = x & (!y | z);
        System.out.println(""+ b1 + " " + b3 + " " + b5);
    }
}
