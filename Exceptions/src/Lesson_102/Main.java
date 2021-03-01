package Lesson_102;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x = 0, index = 0, y = 1;
        int[] z = new int[10];
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("1/2/3?");
            try {
                x = sc.nextInt();
            } catch(InputMismatchException e){
                System.out.println("YA A MORON OR SOMETHING, I TOLD YA TO SELECT ONE NUMBEH, YOU BASTA!!");
                continue;
            }
            if(x==1) {
                index = 25;
                break;
            } else if(x==2) y = 0;
            else if(x==3) break;
            else System.out.println("YA REALLY STOOPED OR WHAT, ARSEHOLE");
        }
        try {
            z[index] = 100;
            x = 10/y;
            System.out.println("NO PROB, THX 4 COOPERATING");
        } catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("WELL, 'RON'");
        } finally {
            System.out.println("CLOSE DA LEAK");
            sc.close();
        }
    }
}
