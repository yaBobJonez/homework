package PW5_19Tasks;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Main3 {
    public static void main(String[] args) {
        int[] a = {1, 2};
        int[] b = {1, 2};
        System.out.println("a/b: "+ Arrays.equals(a, b));
        int[][] aDeep = {{1, 2}, {3, 4}};
        int[][] bDeep = {{1, 2}, {3, 4}};
        System.out.println("aDeep/bDeep: "+Arrays.deepEquals(aDeep, bDeep)+System.lineSeparator());

        int[] arr = new int[10];
        int i = 10; while(i --> 0) arr[i] = ThreadLocalRandom.current().nextInt(0, 101);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int n = -1; for(int k = 0; k < arr.length; k++) if(arr[k]==62) n = k;
        System.out.println(n!=-1?"Число '62' под индексом '"+n+"'.":"Числа '62' нет.");
    }
}
