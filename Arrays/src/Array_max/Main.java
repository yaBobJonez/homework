package Array_max;

import Common.General;

public class Main {
    //Спонсируеться Артёмом(68%) & Мишей(32%)™
    public static void main(String[] args) {
        int[] arr1 = new int [15];
        for( int i = 0; i < 15; i++){
            arr1 [i] = General.random(154, 186);
        }
        int max = 154,  min = 186;
        int nMax = 0, nMin = 0;
        int sum = 0;
        double middle;
        for( int i = 0; i < 15; i++){
            if(arr1[i] > max){
                max = arr1[i];
                nMax = i;
            }
            if(arr1[i] < min){
                min = arr1[i];
                nMin = i;
            }
            sum += arr1[i];
        }
        middle = sum / 15.0;
        System.out.println(sum);
        //for(int i : arr1) System.out.println("["+i+"]");
        System.out.println("Максимальный рост " + max + " см на " + nMax + " месте.");
        System.out.println("Минимальный рост " + min + " см на " + nMin + " месте.");
        System.out.println("Средний рост " + middle + " см.");
    }
}
