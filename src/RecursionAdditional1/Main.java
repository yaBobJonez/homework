package RecursionAdditional1;

import SharedUtils.Utils;

public class Main {
    public static void main(String[] args) {
        double n = Utils.input("Введите число:").asDouble();
        System.out.println((isPowerOf2(n) == 1)? "Это число есть степенью двойки." : "Не являеться степенью двойки.");
    }
    public static double isPowerOf2(double num){
        double temp = num / 2;
        if(temp == 1.0) return 1;
        else if(temp < 1.0) return 0;
        else return isPowerOf2(temp);
    }
}
