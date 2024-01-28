package DataStructures;

// Клас "Черга"
public class Queue {
    double[] dataList;                          /* Вектор даних дійсного типу */
    int tail = -1;                              /* Кінець (хвіст) черги — останній індекс */
    public int getTail(){ return this.tail; }   /* Отримання останнього індексу */

    // Конструктор черги статичного розміру
    public Queue(int size){
        dataList = new double[size];
    }
    // Заміщення методу, що перетворює чергу у рядок, придатний для виведення
    @Override
    public String toString() {
        if(this.tail == -1) return "[]";
        // Використання StringBuilder для форматування
        StringBuilder sb = new StringBuilder("["+this.dataList[0]);
        for(int i = 1; i <= this.tail; i++)
            sb.append(" ← ").append(this.dataList[i]);
        sb.append("]");
        return sb.toString();
    }

    // Метод додання числа у кінець черги, повертає успішність операції
    public boolean enqueue(double item){
        if(isFull()) return false;
        this.dataList[++this.tail] = item;
        return true;
    }
    // Метод видалення з черги, що повертає видалений елемент (виняток, якщо немає елементів)
    public double dequeue() throws NullPointerException {
        if(isEmpty()) throw new NullPointerException("Черга порожня, неможливо видалити елемент");
        double head = this.dataList[0];
        for(int i = 1; i <= this.tail; i++){
            this.dataList[i-1] = this.dataList[i];
        } this.dataList[this.tail--] = 0.0d;
        return head;
    }
    // Метод для можливості отримання довільного елемента у черзі; виняток, якщо немає такого індексу
    public double get(int index) throws NullPointerException {
        if(isEmpty() || index > this.tail) throw new NullPointerException("Елемент з індексом "+index+" не існує");
        return this.dataList[index];
    }
    // Перевірка, чи заповнена черга
    public boolean isFull(){
        return this.dataList.length-1 == this.tail;
    }
    // Перевірка, чи порожня черга
    public boolean isEmpty(){
        return this.tail == -1;
    }
}
