package Exceptions4;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) throws Exception {
        File f = new File("./src/Exceptions4/File1.txt");
        if(!f.exists()) f.createNewFile();
        System.out.println(f.getAbsolutePath() +" : "+ f.getFreeSpace()/1000/1000/1000 +"GB / "+ f.getTotalSpace()/1000/1000/1000 +" GB");
        int x = 30, y = 0; int[] z = {1, 2, 3};
        divide(x, y);
        display(z);
        File f2 = new File("./src/Exceptions4/File3.txt");
        create(f2);
        File f3 = new File("./src/Exceptions4/File4.txt");
        try { createFile(f3); }
        catch(IOException e){ System.err.println("Ошибка: " + e.getClass().getSimpleName()); }
    }
    private static void divide(int a, int b){
        try{ System.out.println(a / b); }
        catch(ArithmeticException e){ System.err.println("Ошибка: " + e.getClass().getSimpleName()); }
    }
    private static void display(int[] arr){
        try { System.out.println(arr[3]); }
        catch(ArrayIndexOutOfBoundsException e){ System.err.println("Ошибка: " + e.getClass().getSimpleName()); }
    }
    private static void create(File f){
        try { createFile(f); }
        catch(IOException e){ System.err.println("Ошибка: " + e.getClass().getSimpleName()); }
    } private static void createFile(File f) throws IOException {
        if(!f.exists()) f.createNewFile();
    }
}
