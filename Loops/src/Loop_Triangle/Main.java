package Loop_Triangle;

public class Main {
    public static void main(String[] args) {
        /*
        //Треугольник 1)
        for(int i = 0; i < 10; i++){
            System.out.println("*".repeat(i));
        } for(int i = 10; i > 0; i--){
            System.out.println("*".repeat(i));
        }
        *//*
        //Треугольник 2)
        for(int i = 0; i < 10; i++){
            System.out.print(" ".repeat(i));
            System.out.println("*".repeat(10-i));
        }
        *//*
        //Треугольник 3)
        for(int i = 10; i > 0; i--){
            System.out.print(" ".repeat(i));
            System.out.println("*".repeat(10-i));
        }
        *//*
        //Треугольник 4)
        for(int i = 10; i > 0; i--){
            System.out.print(" ".repeat(i));
            System.out.println("*".repeat(10-i));
        } for(int i = 0; i < 10; i++){
            System.out.print(" ".repeat(i));
            System.out.println("*".repeat(10-i));
        }
        */
        //Треугольник 5)
        for(int i = 7; i > 0; i--){
            System.out.print(" ".repeat(i+3));
            System.out.print("*".repeat(7-i));
            System.out.print("*".repeat(8-i));
            System.out.println(" ".repeat(i));
        } for(int i = 9; i > 0; i--){
            System.out.print(" ".repeat(i));
            System.out.print("*".repeat(10-i));
            System.out.print("*".repeat(11-i));
            System.out.println(" ".repeat(i));
        }
    }
}
