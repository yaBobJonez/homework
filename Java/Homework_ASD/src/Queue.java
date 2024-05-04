public class Queue {
    static class QueueNode {
        int data;
        QueueNode next;
        public QueueNode(int data) {
            this.data = data;
        }
    }

    private QueueNode head = null;

    public Queue(int n) {
        head = new QueueNode(n);
    }
    public Queue(){}

    public void enqueue(int data) {
        if (isEmpty()) head = new QueueNode(data);
        else {
            QueueNode last = head;
            while (last.next != null) last = last.next;
            last.next = new QueueNode(data);
        }
    }
    public int dequeue() {
        if (isEmpty()) return -1;
        int data = head.data;
        head = head.next;
        return data;
    }
    public boolean isEmpty() {
        return head == null;
    }
}
