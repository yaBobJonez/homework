import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// Основний клас програми
public class Main {
    // Точка входу
    public static void main(String[] args) {
        // Запит на введення кількості книжок
        int n = promptBooksAmount();

        /*
         * Генерація "книжок" у вигляді масивів з їхніми номерами:
         * secondaryBooks містить три книжки одного автора — {1, 2, 3}
         * primaryBooks містить решту книг з номерами від 4.
         */
        int[] secondaryBooks = new int[Math.min(n, 3)];
        for (int i = 1; i <= secondaryBooks.length; i++) secondaryBooks[i-1] = i;
        int[] primaryBooks = new int[Math.max(0, n-3)];
        for (int i = 4; i <= primaryBooks.length + 3; i++) primaryBooks[i-4] = i;

        // Відкриття файлу для запису комбінацій безпечно через try-with-resources
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("list.csv"))) {
            // Якщо книжок менше ніж 4, то маємо P(n) комбінацій
            if (n < 4) {
                for (int[] firstPart : permutations(secondaryBooks))
                    writer.write(join(firstPart) + "\n");
            } else {
                /*
                 * Інакше, маємо P(3) перестановок трьох книг одного автора,
                 * P(n-2) перестановок решти книг + даного "блоку" з тьрох книг,
                 * і врешті, для виведення, такі три книжки можуть стояти на місцях від 0 до n-2.
                 * Загальна кількість комбінацій: P(3) × P(n-2) = 6×(n-2)!
                 */
                for (int[] threeBooks : permutations(secondaryBooks)) {
                    for (int[] primaryPart : permutations(primaryBooks)) {
                        for (int threeBooksPos = 0; threeBooksPos < n-2; threeBooksPos++) {
                            /*
                             * Виводяться книжки з "решти", які стоять до "блоку",
                             * потім поточна перестановка трьох книг одного автора,
                             * а потім книжки з "решти" після "блоку" з трьох книг.
                             */
                            for (int i = 0; i < threeBooksPos; i++)
                                writer.write(primaryPart[i] + ",");
                            writer.write(join(threeBooks));
                            for (int i = threeBooksPos; i < primaryPart.length; i++)
                                writer.write("," + primaryPart[i]);
                            writer.write("\n");
                        }
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Неможливо відкрити/створити файл для запису.");
        }

        // Підрахунок кількості перестановок книжок
        int count = n < 4? factorial(n) : 6 * factorial(n-2);
        System.out.println("Кількість перестановок: " + count);
    }

    /*
     * Функції обчислення перестановок P з масиву книжок; повертає фактично масив комбінацій
     */
    private static AutoArray permutations(int[] books) throws IOException {
        AutoArray allPermutations = new AutoArray(factorial(books.length));
        permutations(books.length, books, allPermutations);
        return allPermutations;
    }
    private static void permutations(int n, int[] books, AutoArray list) {
        if (n == 1) {
            list.add(Arrays.copyOf(books, books.length));
            return;
        } for (int i = 0; i < n; i++) {
            swap(books, i, n-1);
            permutations(n-1, books, list);
            swap(books, i, n-1);
        }
    }
    // Допоміжна функція перестановки елементів масиву
    private static void swap(int[] arr, int from, int to) {
        int temp = arr[from];
        arr[from] = arr[to];
        arr[to] = temp;
    }
    // Допоміжна функція виведення елементів масиву, розділених комами, у вигляді рядка
    private static String join(int[] arr) {
        return IntStream.of(arr).mapToObj(String::valueOf).collect(Collectors.joining(","));
    }
    // Допоміжна функція обчислення факторіалу (значення перестановок P)
    private static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        return fact;
    }

    // Функція, що запитує введення кількості книжок (ціле додатне число)
    private static int promptBooksAmount() {
        System.out.println("Введіть кількість книг:");
        Scanner sc = new Scanner(System.in);
        int n = -1; do {
            if (sc.hasNextInt()) n = sc.nextInt();
            sc.nextLine();
        } while (n < 1);
        return n;
    }
}
