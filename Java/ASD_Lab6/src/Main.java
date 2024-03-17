import java.util.Random;
import java.util.Scanner;

// Основний клас програми
public class Main {
    // Метод здійснення одного тесту обраним алгоритмом на 10000 елементах з визначенням часу
    private static long benchmarkUnsorted(boolean useAltAlgorithm) {
        Integer[] arr = new Integer[10000];
        for (int i = 0; i < 10000; i++) arr[i] = 10000-i;
        long before = System.nanoTime();
        if (useAltAlgorithm) MedianQuickSort.sort(arr);
        else BasicQuickSort.sort(arr);
        long after = System.nanoTime();
        return after - before;
    }
    // аналогічний метод для частково відсортованого (довільний порядок) масиву
    private static long benchmarkPartiallySorted(boolean useAltAlgorithm) {
        Random rng = new Random(0);
        Integer[] arr = new Integer[10000];
        for (int i = 0; i < 10000; i++) arr[i] = rng.nextInt(10000);
        long before = System.nanoTime();
        if (useAltAlgorithm) MedianQuickSort.sort(arr);
        else BasicQuickSort.sort(arr);
        long after = System.nanoTime();
        return after - before;
    }
    // аналогічний метод для відсортованого масиву
    private static long benchmarkSorted(boolean useAltAlgorithm) {
        Integer[] arr = new Integer[10000];
        for (int i = 0; i < 10000; i++) arr[i] = i;
        long before = System.nanoTime();
        if (useAltAlgorithm) MedianQuickSort.sort(arr);
        else BasicQuickSort.sort(arr);
        long after = System.nanoTime();
        return after - before;
    }

    // Основна точка входу програми
    public static void main(String[] args) {
        // Надання можливості здійснення довільної кількості тестів
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть кількість повторень тестів:");
        int it = 0; do {
            if (sc.hasNextInt()) it = sc.nextInt();
            sc.nextLine();
        } while (it < 1);

        // Виконання швидкого базового сортування
        System.out.println("\tШвидке базове");
        long basicPartAvg = 0, basicUnsort = 0, basicSort = 0;
        for (int i = 0; i < it; i++) basicUnsort += benchmarkUnsorted(false);
        for (int i = 0; i < it; i++) basicPartAvg += benchmarkPartiallySorted(false);
        for (int i = 0; i < it; i++) basicSort += benchmarkSorted(false);
        basicPartAvg /= it; basicUnsort /= it; basicSort /= it;
        System.out.printf("Частково: %d\nНевідсортований: %d\nВідсортований: %d\n",
                basicPartAvg, basicUnsort, basicSort);

        // Виконання швидкого сортування з визначенням медіани
        System.out.println("\tШвидке з визначенням медіани з трьох елементів");
        long medPartAvg = 0, medUnsort = 0, medSort = 0;
        for (int i = 0; i < it; i++) medUnsort += benchmarkUnsorted(true);
        for (int i = 0; i < it; i++) medPartAvg += benchmarkPartiallySorted(true);
        for (int i = 0; i < it; i++) medSort += benchmarkSorted(true);
        medPartAvg /= it; medUnsort /= it; medSort /= it;
        System.out.printf("Відсортований: %d\nНевідсортований: %d\nЧастково: %d\n",
                medSort, medUnsort, medPartAvg);
    }
}
