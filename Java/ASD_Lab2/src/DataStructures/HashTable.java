package DataStructures;

// Клас "Хеш-таблиця"
public class HashTable {
    BucketNode[] buckets;   /* Масив звʼязаних списків для зберігання елементів */
    int size;               /* Розмір хеш-таблиці — кількість комірок */

    // Конструктор, який виділяє памʼять заданого розміру
    public HashTable(int size){
        this.buckets = new BucketNode[size];
        this.size = size;
    }
    /*
     * Функція хешування методом ділення (mod розмір):
     * Ключ-координата X може бути дійсним числом, отже округлюється.
     * Окрім цього, значення X може бути відʼємне, тому береться за модулем.
     */
    protected int hash(double key){
        return Math.abs( (int)Math.round(key) % size );
    }

    /*
     * Метод вставки у хеш-таблицю:
     * В умові завдання вказано, що "значення false повертається у разі, якщо колізія не вирішується
     * (тільки для хеш-таблиць з відкритою адресацією)", проте не зазначено, коли повертати false для
     * таблиць з роздільним звʼязуванням, отже таке значення повертається, якщо ідентичний вектор вже
     * наявний і перезаписувати його немає сенсу.
     */
    public boolean insert(Vector vector){
        int hash = this.hash(vector.getX());
        BucketNode curr = this.buckets[hash];
        for(BucketNode next = curr; next != null; curr = next, next = next.next)
            if (curr.data.equals(vector)) return false;
        if (curr == null) this.buckets[hash] = new BucketNode(vector);
        else curr.next = new BucketNode(vector);
        return true;
    }
    // Метод отримання вектора за ключем; помилка, якщо такого немає
    public Vector get(double x){
        BucketNode list = this.buckets[this.hash(x)];
        if (list != null) for (Vector v : list)
            if (v.getX() == x) return v;
        throw new NullPointerException("Вектора з x = "+x+" у геш-таблиці не існує");
    }
    // Метод перевірки, чи міститься вектор за даним ключем у хеш-таблиці
    public boolean contains(double x){
        BucketNode list = this.buckets[this.hash(x)];
        if (list != null) for (Vector v : list)
            if (v.getX() == x) return true;
        return false;
    }
    /*
     * Метод видалення всіх елементів "зі значенням координати Y менше заданої":
     * здійснюється ітерація по кожній комірці, і для кожного елемента списку, якщо умова виконується,
     * то видаляється шляхом зміщення "голови" на наступний (якщо це перший елемент) або зміною
     * вказівника на наступний у попередньому елементі на наступний після поточного.
     */
    public void remove(double y){
        for (int b = 0; b < this.size; b++)
            for (BucketNode prev = null, curr = this.buckets[b]; curr != null; curr = curr.next)
                if (curr.data.getY() < y)
                    if (prev == null) this.buckets[b] = curr.next;
                    else prev.next = curr.next;
                else prev = curr;
    }

    // Метод для виведення всієї таблиці форматуванням та StringBuilder будує її по рядкам
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(
                String.format("%6s %20s %s\n", "Індекс", "Список ключів", "Елементи")
        ); for (int i = 0; i < this.size; i++)
            sb.append(this.rowToString(i)).append("\n");
        return sb.toString();
    }
    /*
     * Метод для виведення рядка таблиці з індексом, переліком ключів (наочне відображення
     * колізій) та всіх векторів, що зберігаються ланцюгом за індексом
     */
    protected String rowToString(int i) {
        BucketNode list = this.buckets[i];
        if (list == null) return String.format("%6d %20s %s", i, "—", "Порожньо");
        StringBuilder keys = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        for (Vector v : list) {
            int key = (int)Math.round(v.getX());
            keys.append(key).append(",");
            sb.append(v).append(" ");
        } if(!keys.isEmpty()) keys.setLength(keys.length()-1);
        return String.format("%6d %20s %s", i, keys, sb);
    }
}
