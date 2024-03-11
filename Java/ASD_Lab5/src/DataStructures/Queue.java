package DataStructures;

// Реалізація односторонньої черги — допоміжний клас для обходу дерева при виведенні
public class Queue {
    // "Голова" черги та її гетер
    QueueNode head = null;
    public QueueNode getHead() {
        return head;
    }

    // Метод додавання елементів в кінець
    public void enqueue(TreeNode node) {
        if (head == null) head = new QueueNode(node);
        else {
            QueueNode last = head;
            while (last.next != null) last = last.next;
            last.next = new QueueNode(node);
        }
    }
    // Метод витягування елементів з початку
    public TreeNode dequeue(){
        if (head == null) return null;
        QueueNode curr = head;
        head = head.next;
        return curr.data;
    }
}
