package PW5_19Tasks;

import java.util.Arrays;

public class Main4 {
    private static void varargs(String str, int... numbers){
        if(numbers.length==0) System.out.println(str);
        else System.out.println(str+Arrays.toString(numbers));
    } private static void varargs(String str, int[][] numbers){
        System.out.print(str);
        for(int[] nums : numbers) System.out.print(Arrays.toString(nums));
        System.out.println();
    }
    public static void main(String[] args) {
        varargs("A: ");
        varargs("B: ", 2);
        varargs("C: ", 4, 8, 16);
        varargs("D: ", new int[]{32, 64, 128});
        varargs("E: ", new int[][]{
            new int[]{2, 4, 8},
            new int[]{16, 32, 64}
        });
    }
}
