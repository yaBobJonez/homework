package Program;

import DataStructures.BinaryTree;
import DataStructures.Student;

import java.util.Random;

// Головний клас програми
public class Main {
    // Набори імен та прізвищ для випадкової генерації студентів
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
        // 1. Створити екземпляр бінарного дерева
        BinaryTree tree = new BinaryTree();

        // 2. Додати елементи до дерева
        Random rng = new Random();
        for (int i = 0; i < 25; i++) {
            tree.add(new Student(
                firstNames[rng.nextInt(firstNames.length)],
                lastNames[rng.nextInt(lastNames.length)],
                rng.nextInt(5),
                "KB" + rng.nextInt(10_000_000, 100_000_000),
                rng.nextBoolean()
            ));
        }
        // Статичний тестовий набір даних
        /*tree.add(new Student("Святослав", "Флетчер", 3, "KB62930380", false));
        tree.add(new Student("Максим", "Матвієнко", 1, "KB78343996", true));
        tree.add(new Student("Максим", "Задирака", 4, "KB94946914", false));
        tree.add(new Student("Юлія", "Негрій", 2, "KB96154970", false));
        tree.add(new Student("Галина", "Рогач", 1, "KB79801821", false));
        tree.add(new Student("Дарія", "Гончар", 2, "KB69140181", true));
        tree.add(new Student("Юлія", "Чорноліс", 3, "KB64963626", false));
        tree.add(new Student("Юлія", "Лях", 4, "KB53607783", false));
        tree.add(new Student("Тетяна", "Єрмоленко", 4, "KB56457274", false));
        tree.add(new Student("Юлія", "Флетчер", 4, "KB52294839", true));*/

        // 3. Вивести вміст дерева паралельним (in-order) обходом у табличному вигляді
        System.out.println(tree);

        // 4. Знайти та видалити вузли дерева за визначеним критерієм пошуку
        tree.remove();

        // 5. Вивести вміст дерева в табличному вигляді
        System.out.println(tree);
    }
}
