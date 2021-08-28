package Arrays_md_mas3;

import Common.General;

public class Main {
    public static void main(String[] args) {
        int[][] arr = new int[10][10];
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++) arr[i][j] = General.random(0, 25);
        }
        String str = "-".repeat(30) + System.lineSeparator();
        for(int i = 0; i < 10; i++){
            str += "| ";
            for(int j = 0; j < 10; j++){
                if(arr[i][j] % 2 == 0){
                    str += arr[i][j];
                    str += " | ";
                }
            }
            str += System.lineSeparator();
            str += "-".repeat(30) + System.lineSeparator();
        }
        System.out.println(str);
    }
}
