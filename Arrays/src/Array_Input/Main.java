package Array_Input;

import Common.General;
import Common.Input;

public class Main {
    public static void main(String[] args) {
        int n = 3;

        int[] arr1 = new int[n];
        double[] arr2 = new double[n];
        String[] arr3 = new String[n];
        int[] arr4 = {54, 67, 12, 49};

        for(int i = 0; i < n; i++){
            arr3[i] = Input.input("Введите имя "+(i+1)+"-го ученика:");
        }
        for(int i = 0; i < n; i++) arr2[i] = 3.1415 * i;
        for(int i = 0; i < n; i++) arr1[i] = General.random(0, 10);

        for(int el : arr1) System.out.print(el + " "); System.out.println();
        for(double el : arr2) System.out.print(el + " "); System.out.println();
        for(String el : arr3) System.out.print(el + " "); System.out.println();
    }
}
