package Program;

import DataStructures.HashTable;
import DataStructures.Vector;

import java.util.Random;
import java.util.Scanner;

// Основний клас-диспетчер програми
public class Main {
    // Для частого використання доречно винести сканер потоку введення як статичну змінну класу
    private static Scanner sc = new Scanner(System.in);

    // Точка входу — головна процедура програми
    public static void main(String[] args) {
        // 1. Створити екземпляр хеш-таблиці розміру, заданого користувачем з клавіатури
        System.out.println("Введіть розмір хеш-таблиці:");
        int size = -1;
        do {
            if (sc.hasNextInt()) size = sc.nextInt();
            sc.nextLine();
        } while (size <= 0);
        HashTable table = new HashTable(size);
        // 2. Вставити елементи у хеш-таблицю з урахуванням колізії та вивести вміст
        // Елементи генеруються випадково з довжиною векторів від 1 до розміру, помноженого на 3
        Random rnd = new Random();
        for (int i = 0; i < size; i++){
            int magnitude = rnd.nextInt(1, size*3);
            int angle = rnd.nextInt(0, 360);
            table.insert(new Vector(magnitude, angle));
        }
        System.out.println(table);
        // 3. Видалити елементи зі значенням координати Y, меншої за задану, і вивести вміст
        System.out.println("Введіть мінімальну координату Y:");
        double minY = Double.NaN;
        do {
            if (sc.hasNextDouble()) minY = sc.nextDouble();
            sc.nextLine();
        } while (Double.isNaN(minY));
        table.remove(minY);
        System.out.print(table);
    }
}
