package Lesson10;

import Common.Input;

public class Main {
    public static void main(String[] args) {
        int n = Input.inputInt("Введите число дня недели (1-7):");
        String s = "";
        switch (n){
            case 1: s = "Понедельник"; break;
            case 2: s = "Вторник"; break;
            case 3: s = "Среда"; break;
            case 4: s = "Четверг"; break;
            case 5: s = "Пятница"; break;
            case 6: s = "Суббота"; break;
            case 7: s = "Воскресение"; break;
            default: System.err.println("Не день недели!"); System.exit(1);
        }
        System.out.println(s);
    }
}
