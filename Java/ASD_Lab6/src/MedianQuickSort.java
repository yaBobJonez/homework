public class MedianQuickSort {
    // Допоміжний метод перестановки елементів
    protected static <T extends Comparable<T>> void swap(T[] data, int a, int b) {
        T temp = data[a];
        data[a] = data[b];
        data[b] = temp;
    }

    /*
     * Метод швидкого сортування (QuickSort) з визначенням медіани:
     * роздільний елемент обирається на основі першого, останнього та середнього значень.
     * Середній елемент міняється місцями з передостаннім; перший, передостанній та останній
     * упорядковуються. Після цього сортується розділенням на дві частини набір даних між
     * першим та передостаннім елементами. Врешті, алгоритм припиняє роботу, якщо кількість
     * елементів підвибірки менша за обране число 2.
     */
    public static <T extends Comparable<T>> void sort(T[] data) {
        quickMedianSort(data, 0, data.length - 1);
    }

    protected static <T extends Comparable<T>> void quickMedianSort(T[] data, int from, int to) {
        if (from >= to) return;
        if (to - from == 1) {
            if (data[from].compareTo(data[to]) > 0) swap(data, from, to);
        } else {
            median(data, from, to);
            if (to - from != 2) {
                int q = partition(data, from, to - 1);
                quickMedianSort(data, from, q - 1);
                quickMedianSort(data, q + 1, to);
            }
        }
    }
    // Метод знаходження медіани та упорядкування першого, останнього елементів та медіани
    protected static <T extends Comparable<T>> void median(T[] data, int from, int to) {
        int med = from + (to - from)/2;
        if (data[from].compareTo(data[med]) > 0) swap(data, from, med);
        if (data[from].compareTo(data[to]) > 0) swap(data, from, to);
        if (data[med].compareTo(data[to]) > 0) swap(data, med, to);
        swap(data, med, to - 1);
    }
    // Метод розділення масиву даних на частини
    protected static <T extends Comparable<T>> int partition(T[] data, int from, int to) {
        int i = from + 1;
        int j = to - 1;
        for (T value = data[to];;) {
            while (data[i].compareTo(value) < 0) i++;
            while (data[j].compareTo(value) > 0) j--;
            if (i >= j || data[i].compareTo(data[j]) == 0) break;
            else swap(data, i, j);
        } swap(data, i, to);
        return i;
    }
}
