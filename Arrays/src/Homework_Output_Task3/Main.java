package Homework_Output_Task3;

import yaBobJonez.General;

public class Main {
    public static void main(String[] args) {
        int[] first = new int[20];
        for(int i = 0; i < 20; i++) first[i] = General.random(-45, 100);
        int[] second = new int[30];
        for(int i = 0; i < 30; i++) second[i] = General.random(-100, 200);
        int numOfMerged = 0;
        for(int el : first) if(el % 2 == 0) numOfMerged++;
        for(int el : second) if(el % 2 == 0) numOfMerged++;
        int[] mergedOnlyDivisibleBy2 = new int[numOfMerged];
        int i = 0;
        for(int el : first){
            if(el % 2 == 0){ mergedOnlyDivisibleBy2[i] = el; i++; }
        } for(int el : second){
            if(el % 2 == 0){ mergedOnlyDivisibleBy2[i] = el; i++; }
        }
        System.out.println("Массив 1:");
        for(int el : first) System.out.print(el+" ");
        System.out.println("\nМассив 2:");
        for(int el : second) System.out.print(el+" ");
        System.out.println("\nМассив с только парными числами:");
        for(int el : mergedOnlyDivisibleBy2) System.out.print(el+" ");
    }
}
