package Loop_Triangle;

import Common.Input;

public class Main {
    public static void main(String[] args) throws Exception {
        int selected = Input.inputInt("Выберите треугольник:\n[1][2][3][4][5]");
        switch(selected){
        	case 1: triangle1(); break;
        	case 2: triangle2(); break;
        	case 3: triangle3(); break;
        	case 4: triangle4(); break;
        	case 5: triangle5(); break;
        	default: System.err.println("Вы должны были выбрать число от 1 до 5."); System.exit(1);
        }
    }
    public static void triangle1(){
    	for(int i = 0; i < 10; i++) System.out.println("*".repeat(i));
        for(int i = 10; i > 0; i--) System.out.println("*".repeat(i));
    } public static void triangle2(){
    	for(int i = 0; i < 10; i++){
            System.out.print(" ".repeat(i));
            System.out.println("*".repeat(10-i));
        }
    } public static void triangle3(){
    	for(int i = 10; i > 0; i--){
            System.out.print(" ".repeat(i));
            System.out.println("*".repeat(10-i));
        }
    } public static void triangle4(){
    	for(int i = 10; i > 0; i--){
            System.out.print(" ".repeat(i));
            System.out.println("*".repeat(10-i));
        } for(int i = 0; i < 10; i++){
            System.out.print(" ".repeat(i));
            System.out.println("*".repeat(10-i));
        }
    } public static void triangle5(){ //Ёлка ^w^
    	System.out.println(" ".repeat(10) + "#\n" + " ".repeat(8) + "#".repeat(5) + "\n" + " ".repeat(9) + "# #");
    	for(int i = 7; i > 0; i--){
            System.out.print(" ".repeat(i+3));
            System.out.print("^".repeat(7-i));
            System.out.print("^".repeat(8-i));
            System.out.println(" ".repeat(i));
        } for(int i = 9; i > 0; i--){
            System.out.print(" ".repeat(i));
            System.out.print("^".repeat(10-i));
            System.out.print("^".repeat(11-i));
            System.out.println(" ".repeat(i));
        } for(int i = 0; i < 5; i++){
        	System.out.print(" ".repeat(8));
        	System.out.print("*".repeat(5));
        	System.out.println(" ".repeat(7));
        }
    }
}
