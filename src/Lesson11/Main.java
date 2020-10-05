package Lesson11;

import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите точку А (x y):");
        String[] pointA = input.nextLine().split(" ");
        int a1 = Integer.parseInt(pointA[0]);
        int b1 = Integer.parseInt(pointA[1]);
        System.out.println("Введите точку B (x y):");
        String[] pointB = input.nextLine().split(" ");
        int a2 = Integer.parseInt(pointB[0]);
        int b2 = Integer.parseInt(pointB[1]);
        System.out.println("Введите точку X (x y):");
        String[] pointX = input.nextLine().split(" ");
        int x1 = Integer.parseInt(pointX[0]);
        int y1 = Integer.parseInt(pointX[1]);
        System.out.println("Введите точку Y (x y):");
        String[] pointY = input.nextLine().split(" "); //x1 = 2, y1 = 6; x2 = 6, y2 = 4
        int x2 = Integer.parseInt(pointY[0]);
        int y2 = Integer.parseInt(pointY[1]);
        if(pointsOverlap(a1, b1, x2, y2) || pointsOverlap(a2, b2, x1, y1) || pointsOverlap(a2, b1, x1, y2) || pointsOverlap(a1, b2, x2, y1)){
            System.out.println("Точки при вершинах совпадают."); System.exit(0);
        } else if(sidesOverlap(x1, a2) || sidesOverlap(a1, x2) || sidesOverlap(y2, b1) || sidesOverlap(b2, y1)){
            System.out.println("Стороны прямоугольников совпадают."); System.exit(0);
        } else if(pointContained(x1, y1, a1, b1, a2, b2) || pointContained(x2, y1, a1, b1, a2, b2) || pointContained(x2, y2, a1, b1, a2, b2) || pointContained(x1, y2, a1, b1, a2, b2)){
            System.out.println("Прямоугольник А налегает на прямоугольник Б."); System.exit(0);
        } else if(pointContained(a1, b1, x1, y1, x2, y2) || pointContained(a2, b1, x1, y1, x2, y2) || pointContained(a2, b2, x1, y1, x2, y2) || pointContained(a1, b2, x1, y1, x2, y2)){
            System.out.println("Прямоугольник Б налегает на прямоугольник А."); System.exit(0);
        } else System.out.println("Прямоугольники не взаимодействуют друг с другом."); System.exit(0);
    }
    public static boolean pointsOverlap(int a, int b, int x, int y){
        return (a == x) && (b == y);
    }
    public static boolean sidesOverlap(int a, int b){
        return a == b;
    }
    public static boolean pointContained(int p1, int p2, int x1, int y1, int x2, int y2){
        return p1 > x1 && p1 < x2 && p2 > y2 && p2 < y1;
    }
}
