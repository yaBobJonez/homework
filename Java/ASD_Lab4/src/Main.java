import java.util.Random;
import java.util.Scanner;

// Головний клас програми
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
    /*
     * Метод генерації телефонних номерів студентів у міжнародному форматі
     * відповідно до офіційного формату НКЕК України (https://nkrzi.gov.ua/index.php?r=site/index&pg=99&id=1730).
     * Імітація телефонних кодів зони нумерації забезпечується випадковими числами в проміжку [32; 6570).
     */
    private static String generatePhoneNumber() {
        StringBuilder sb = new StringBuilder("+380 (");
        int areaCode = rng.nextInt(32, 6570);
        int fixedSize = 9 - String.valueOf(areaCode).length();
        sb.append(areaCode).append(") ");
        sb.append(rng.nextInt(
                (int) Math.pow(10, fixedSize - 1),
                (int) Math.pow(10, fixedSize)
        ));
        return sb.toString();
    }
    // Допоміжний метод виведення масиву у табличному вигляді з форматуванням
    private static void printOut(Student[] students) {
        System.out.format("Код міста | %12s %-12s | %s\n", "Імʼя", "прізвище", "Номер телефону");
        System.out.println("-".repeat(10) + "|" + "-".repeat(27) + "|" + "-".repeat(18));
        for (Student s : students) System.out.println(s);
        System.out.println();
    }
    // Метод введення розміру масиву для його створення (типово 15)
    private static int promptSize() {
        System.out.println("Введіть розмір масиву студентів (\"def\" — значення за замовчуванням):");
        int res = -1;
        do {
            if(sc.hasNextInt()) res = sc.nextInt();
            else if(sc.nextLine().equals("def")) return 15;
        } while(res <= 0);
        return res;
    }

    // Точка входу програми
    public static void main(String[] args) {
        // 0. Створити та заповнити одновимірний масив студентів
        int size = promptSize();
        Student[] students = new Student[size];
        for (int i = 0; i < size; i++) {
            students[i] = new Student(
                    firstNames[rng.nextInt(firstNames.length)],
                    lastNames[rng.nextInt(lastNames.length)],
                    rng.nextInt(1, 1000),
                    generatePhoneNumber()
            );
        }

        // 1. Вивести вміст структури даних до сортування
        printOut(students);

        // 2. Сортувати структуру даних
        quickSort(students);

        // 3. Вивести вміст структури даних після сортування
        printOut(students);
    }

    /*
     * Метод "швидкого сортування" (Quicksort):
     * За опорну точку обирається перший елемент масиву; для кожного елемента з кінця, якщо значення коду міста
     * більше ніж опорне, то він міняється місцями з елементом, який після ітерацій залишиться праворуч від точки
     * опори; далі поточна точка опори стає на нове найправіше місце (а елемент на ньому на початок масиву); і
     * нарешті викликається рекурсивно ця ж функція для лівої та правої частин масиву.
     * Сортування відбувається доки початковий індекс менше кінцевого — тобто доки в частині не залишається
     * один елемент.
     */
    static void quickSort(Student[] students) {
        quickSort(students, 0, students.length - 1);
    }
    static protected void quickSort(Student[] students, int from, int to) {
        if (from >= to) return;
        int pivot = students[from].city;
        int nextPivotPos = to;
        for (int i = to; i > from; i--) if (students[i].city > pivot) {
            Student temp = students[i];
            students[i] = students[nextPivotPos];
            students[nextPivotPos--] = temp;
        }
        Student temp = students[nextPivotPos];
        students[nextPivotPos] = students[from];
        students[from] = temp;
        quickSort(students, from, nextPivotPos - 1);
        quickSort(students, nextPivotPos + 1, to);
    }
}
