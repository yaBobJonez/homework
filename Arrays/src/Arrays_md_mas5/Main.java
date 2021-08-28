package Arrays_md_mas5;

import Common.General;

public class Main {
    public static void main(String[] args) {
        int[][] arr = new int[10][10];
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++) arr[i][j] = General.random(0, 25);
        }
        int[] sum = new int[10];
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                sum[i] += arr[i][j];
            }
        }
        for(int j : sum) System.out.print(""+ j + " ");
        System.out.println();
    }
}
