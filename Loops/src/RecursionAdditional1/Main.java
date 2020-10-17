package RecursionAdditional1;

import yaBobJonez.Control;
import yaBobJonez.Input;
import yaBobJonez.Output;

public class Main {
    public static void main(String[] args) {
        /*int n = Input.inputInt("Введите число:");
        System.out.println((isPowerOf2(n) == 1)? "Это число есть степенью двойки." : "Не являеться степенью двойки.");*/
    	test();
    }
    public static int isPowerOf2(int num){
        if(num == 2) return 1;
        else if(num % 2 != 0) return 0;
        return isPowerOf2(num / 2);
    }
    
    //Тесты (2..32)
    public static void test(){
    	int[] values = new int[31];
    	for(int i = 2; i <= 32; i++) values[i-2] = i;
    	for(int i : values){
    		if(i == 2 || i == 4 || i == 8 || i == 16 || i == 32){
    			if(isPowerOf2(i) != 1){ System.err.print("Провал"); System.exit(1); } else continue;
    		} if(isPowerOf2(i) != 0){ System.err.print("Провал"); System.exit(1); } else continue;
    	} Output.print("Успешно.");
    }
}
