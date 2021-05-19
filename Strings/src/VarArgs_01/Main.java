package VarArgs_01;

public class Main {
    public static void main(String[] args) {
        int[][] arr = new int[][]{
            new int[]{2, 4, 8},
            new int[]{16, 32, 64},
            new int[]{128, 256, 512}
        };
        System.out.println(calculateSumOfIntArrays(arr[0], arr[1], arr[2]));
    }
    private static int calculateSumOfIntArrays(int[]... arrays){
        int sum = 0;
        for(int[] array : arrays) for(int number : array) sum += number;
        return sum;
    }
}
