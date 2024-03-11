package DataStructures;

// Вузол черги (див. DataStructures/Queue)
public class QueueNode {
    TreeNode data;          /* Вузол дерева, що зберігається у вузлі черги */
    QueueNode next = null;  /* Посилання на наступний елемент */
    // Конструктор
    public QueueNode(TreeNode data) {
        this.data = data;
    }
}
