package Lesson9;

import yaBobJonez.Input;

public class Main {
    public static void main(String[] args) {
        do{
            char[] num = Input.inputString("Введите число:").toCharArray();
            String str = "";
            for(char digit : num){
                switch(digit){
                    case '0': str += "zero "; break;
                    case '1': str += "one "; break;
                    case '2': str += "two "; break;
                    case '3': str += "three "; break;
                    case '4': str += "four "; break;
                    case '5': str += "five "; break;
                    case '6': str += "six "; break;
                    case '7': str += "seven "; break;
                    case '8': str += "eight "; break;
                    case '9': str += "nine "; break;
                    default: System.err.println("Не число или ошибка парсинга!"); System.exit(1);
                }
            } System.out.println(str);
        } while(Input.inputString("Ещё раз? Y/N").equals("Y"));
    }
}
