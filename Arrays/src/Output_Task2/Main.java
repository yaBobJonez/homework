package Output_Task2;

import yaBobJonez.General;

public class Main {
    public static void main(String[] args) {
        int[] primary = new int[20];
        int sum = 0;
        for(int i = 0; i < 20; i++){
            int rand = General.random(-70, 90);
            sum += rand;
            primary[i] = rand;
        }
        int average = sum / 20;
        int secLen = 0;
        for(int n : primary) if(n > average) secLen++;
        int[] secondary = new int[secLen];
        int i = 0;
        for(int el : primary){
            if(el > average){ secondary[i] = el; i++; }
        }
        System.out.println("Оригинальный массив:");
        for(int el : primary) System.out.print(el+" ");
        System.out.println("\nСреднее: " + average);
        System.out.println("Больше среднего:");
        for(int el : secondary) System.out.print(el+" ");
    }
}
