package SharedUtils;

import java.util.Scanner;

public class Input {
    /*Это я создал класс с функциями, общий для всех проектов, который позволяет мне легче
    получить ввод с сообщением (или без) -- Михайло Стецюк.*/
    public static int inputInt(String mes){
        if(mes != null) System.out.println(mes);
        return new Scanner(System.in).nextInt();
    }
    public static double inputDouble(String mes){
        if(mes != null) System.out.println(mes);
        return new Scanner(System.in).nextDouble();
    }
    public static String inputString(String mes){
        if(mes != null) System.out.println(mes);
        return new Scanner(System.in).nextLine();
    }
    public static boolean inputBoolean(String mes){
        if(mes != null) System.out.println(mes);
        return new Scanner(System.in).nextBoolean();
    }
}
