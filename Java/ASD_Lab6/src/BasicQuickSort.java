public class BasicQuickSort {
    // Допоміжний метод перестановки елементів
    protected static <T extends Comparable<T>> void swap(T[] data, int a, int b) {
        T temp = data[a];
        data[a] = data[b];
        data[b] = temp;
    }

    /*
     * Метод "швидкого сортування" (Quicksort) — базовий:
     * За опорну точку обирається перший елемент масиву; для кожного елемента з кінця, якщо значення коду міста
     * більше ніж опорне, то він міняється місцями з елементом, який після ітерацій залишиться праворуч від точки
     * опори; далі поточна точка опори стає на нове найправіше місце (а елемент на ньому на початок масиву); і
     * нарешті викликається рекурсивно ця ж функція для лівої та правої частин масиву.
     * Сортування відбувається доки початковий індекс менше кінцевого — тобто доки в частині не залишається
     * один елемент.
     */
    public static <T extends Comparable<T>> void sort(T[] data) {
        quickSort(data, 0, data.length - 1);
    }

    protected static <T extends Comparable<T>> void quickSort(T[] data, int from, int to) {
        if (from >= to) return;
        int q = partition(data, from, to);
        quickSort(data, from, q - 1);
        quickSort(data, q + 1, to);
    }
    // Метод розбиття масиву на частини
    protected static <T extends Comparable<T>> int partition(T[] data, int from, int to) {
        T pivot = data[to];
        int nextPivotPos = from - 1;
        for (int i = from; i < to; i++)
            if (data[i].compareTo(pivot) <= 0)
                swap(data, ++nextPivotPos, i);
        swap(data, nextPivotPos + 1, to);
        return nextPivotPos + 1;
    }
}
