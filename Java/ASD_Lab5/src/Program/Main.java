package Program;

import DataStructures.BinarySearchTree;
import DataStructures.Student;

import java.util.Random;
import java.util.Scanner;

// Основний клас програми
public class Main {
    /*
     * Генератор випадкових чисел та сканер для введення винесені в окремі поля для
     * компактності коду при додаванні студентів з генерацією випадкових даних.
     * Масиви firstNames та lastNames містять перелік імен та прізвищ для формування студентів.
     */
    private static Random rng = new Random();
    private static Scanner sc = new Scanner(System.in);
    private static String[] firstNames = {
            "Андрій", "Володимир", "Галина", "Дарія", "Єгор", "Катерина", "Максим",
            "Назар", "Олександр", "Поліна", "Святослав", "Тетяна", "Юлія"
    };
    private static String[] lastNames = {
            "Абраменко", "Барщик", "Гончар", "Єрмоленко", "Задирака", "Коломієць",
            "Лях", "Матвієнко", "Негрій", "Рогач", "Стасюк", "Флетчер", "Чорноліс"
    };

    // Точка входу програми
    public static void main(String[] args) {
        // 1. Створити та ініціювати екземпляр BST
        BinarySearchTree tree = new BinarySearchTree();
        for (int i = 0; i < 10; i++) {
            tree.insert(new Student(
                    firstNames[rng.nextInt(firstNames.length)],
                    lastNames[rng.nextInt(lastNames.length)],
                    rng.nextInt(1, 5),
                    rng.nextInt(100, 1000),
                    rng.nextBoolean(),
                    rng.nextInt(100)
            ));
            System.out.println(tree);
        }

        // 2. Знайти та вивести вузол за даним ключем
        System.out.println("Введіть кількість заборгованостей для пошуку:");
        int criteria = -1; do {
            if (sc.hasNextInt()) criteria = sc.nextInt();
            sc.nextLine();
        } while (criteria < 0);
        Student result = tree.search(criteria);
        if (result == null) System.out.println("За даним критерієм нічого не знайдено.");
        else {
            System.out.printf("%9s | %12s %-12s | Курс | Місто | Телефон\n", "Заборгов.", "Іʼя", "Прізвище");
            System.out.println(result);
        }
    }
}
