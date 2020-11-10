package Output_Task1;

import yaBobJonez.General;

public class Main {
    public static void main(String[] args) {
        int[] primary = new int[30];
        for(int i = 0; i < 30; i++) primary[i] = General.random(-100, 100);
        int numOfPositiveIntegers = 0;
        for(int el : primary) if(el > 0) numOfPositiveIntegers++;
        int[] secondary = new int[numOfPositiveIntegers];
        int i = 0;
        for(int el : primary){
            if(el > 0){ secondary[i] = el; i++; }
        }
        System.out.println("Все числа:");
        for(int el : primary) System.out.print(el+" ");
        System.out.println("\nТолько положительные:");
        for(int el : secondary) System.out.print(el+" ");
    }
}
