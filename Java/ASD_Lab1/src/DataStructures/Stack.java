package DataStructures;

// Клас "Стек"
public class Stack {
    /*
     * Так як Вузол Стека напряму повʼязаний з ним, для зручності читання коду
     * я не створював публічний клас Вузла в окремому файлі, а додав його нижче
     * у вигляді статичного підкласу Node.
     */
    public static class Node {
        String data;                                /* Рядок даного вузла */
        public String getData(){ return data; }     /* Отримання значення рядка для читання */
        Node prev;                                  /* Посилання на попередній вузол */
        public Node getPrev(){ return prev; }       /* Отримання попереднього вузла методом */

        // Конструктор вузла; перевірка на допустимість рядка повинна здійснюватися ззовні
        public Node(String data, Node prev){
            this.data = data;
            this.prev = prev;
        }
    }

    Node top = null;                        /* Останній доданий елемент — вершина стеку */
    public Node getTop(){ return top; }     /* Метод для читання останнього доданого елемента */

    // Заміщення методу, що перетворює стек у рядок, придатний для виведення
    @Override
    public String toString() {
        if(isEmpty()) return "[]";
        // Використання StringBuilder для форматування
        StringBuilder sb = new StringBuilder("["+this.top.data);
        for(Node n = this.top.prev; n != null; n = n.prev)
            sb.append(" → ").append(n.data);
        sb.append("]");
        return sb.toString();
    }

    // Метод додавання рядка до стеку; повертає успішність операції
    public boolean push(String data){
        if(!data.matches("[01]+")) return false;
        this.top = new Node(data, this.top);
        return true;
    }
    // Метод видалення останнього рядка з його поверненням; кидає виняток у випадку його відсутності
    public String pop(){
        if(isEmpty()) throw new NullPointerException("Стек порожній, неможливо видалити елемент");
        String data = this.top.data;
        this.top = this.top.prev;
        return data;
    }

    // Перевірка, чи є стек порожнім
    public boolean isEmpty(){
        return this.top == null;
    }
}
