import java.util.Iterator;

// Клас-обгортка над масивом перестановок; не є динамічною структурою даних
public class AutoArray implements Iterable<int[]> {
    private int[][] data; /* Власне масив */
    private int size = 0; /* Поточка кількість зайнятих комірок */

    // Конструктор масиву
    public AutoArray(int capacity) {
        this.data = new int[capacity][];
    }
    // Функція додавання перестановок в кінець
    public boolean add(int[] el) {
        if (size >= data.length) return false;
        data[size++] = el;
        return true;
    }
    // Функція отримання перестановок за індексом
    public int[] get(int index) {
        if (index >= size) return null;
        return this.data[index];
    }

    // Ітератор є допоміжним задля спрощення коду використанням циклу foreach
    @Override
    public Iterator<int[]> iterator() {
        return new It(this.data);
    }
    static class It implements Iterator<int[]> {
        int[][] list;
        int cursor = 0;
        It(int[][] list){ this.list = list; }
        @Override
        public boolean hasNext() {
            return cursor < list.length;
        }

        @Override
        public int[] next() {
            return list[cursor++];
        }
    }
}
