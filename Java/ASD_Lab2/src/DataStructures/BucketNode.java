package DataStructures;

import java.util.Iterator;

/*
 * Клас, що описує вузол однозвʼязного списку для так званого "відра":
 * у хеш-таблицях з роздільним звʼязуванням (separate chaining) колізії вирішуються шляхом формування
 * звʼязного списку, який міститься у комірці масиву, і тоді називається bucket.
 * Для спрощення пошуку векторів цей клас забезпечує можливість ітерації.
 */
public class BucketNode implements Iterable<Vector> {
    Vector data;                /* Вектор, що зберігається у вузлі */
    BucketNode next = null;     /* Посилання на наступний вузол */

    // Базовий конструктор вузла
    public BucketNode(Vector vector){
        this.data = vector;
    }

    /*
     * Опис ітератора дозволяє використовувати цикл for для проходження по всім векторам списку,
     * що, на мою думку, значно спрощує код для пошуку, отримання і виведення елементів хеш-таблиці.
     * Відповідно до API Java, необхідно замістити метод iterator() : Iterator<T>, який створює
     * екземляр класу відповідного ітератора.
     */
    @Override
    public Iterator<Vector> iterator() {
        return new BucketIterator(this);
    }
    static class BucketIterator implements Iterator<Vector> {
        BucketNode current;     /* Посилання на "курсор" — поточний елемент */

        // Конструктор ітератора з посиланням на перший елемент
        public BucketIterator(BucketNode first){
            this.current = first;
        }
        // Заміщення методів перевірки, чи є наступний елемент, та його отримання
        @Override
        public boolean hasNext() {
            return this.current != null;
        }
        @Override
        public Vector next() {
            Vector data = this.current.data;
            current = current.next;
            return data;
        }
    }
}
