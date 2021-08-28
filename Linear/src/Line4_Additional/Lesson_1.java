package Line4_Additional;

import Common.Input;

public class Lesson_1 {
    public static void main(String[] args) {
        int num = Input.inputInt("Введите любое целое число:");
        char[] chars = String.valueOf(num).toCharArray();
        String rev = "";
        for(int i = chars.length - 1; i >= 0; i--) rev += chars[i];
        if(String.valueOf(num).equals(rev)) System.out.println("Число " + rev + " есть палиндромой.");
        else System.out.println("Число " + rev + " НЕ есть палиндромой.");
    }
}
