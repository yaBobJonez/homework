package MinMax;

import yaBobJonez.Input;
import yaBobJonez.Output;

public class Main {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE; int max = Integer.MIN_VALUE;
        int i = 1;
        while(i <= 5){
            int num = Input.inputInt("Введите "+i+"-е число:");
            if(num <= min) min = num;
            if(num >= max) max = num;
            i++;
        } Output.print("Мин: " + min + ", макс: " + max);
    }
}
