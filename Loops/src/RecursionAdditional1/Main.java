package RecursionAdditional1;

import SharedUtils.Utils;

public class Main {
    public static void main(String[] args) {
        int n = Utils.input("Введите число:").asInt();
        System.out.println((isPowerOf2(n) == 1)? "Это число есть степенью двойки." : "Не являеться степенью двойки.");
    }
    public static int isPowerOf2(int num){
        int temp = num / 2;
        if(temp == 1) return 0;
        else if(temp == 2) return 1;
        else return isPowerOf2(temp);
    }
}
