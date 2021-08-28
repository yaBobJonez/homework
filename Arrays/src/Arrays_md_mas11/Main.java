package Arrays_md_mas11;

import Common.General;

public class Main {
    public static void main(String[] args) {
        int[][] arr = new int[8][8];
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++) arr[i][j] = General.random(5, 30);
        }
        int[][] arrRev = new int[8][8];
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                arrRev[j][i] = arr[i][j];
            }
        }
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                System.out.print(""+ arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                System.out.print(""+ arrRev[i][j] + " ");
            }
            System.out.println();
        }
    }
}
