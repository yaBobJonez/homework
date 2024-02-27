package DataStructures;

// Клас, що описує вузол бінарного дерева
public class TreeNode {
    public Student data;            /* Студент, що зберігається у вузлі */
    public TreeNode left = null;    /* Посилання на лівий дочірній вузол */
    public TreeNode right = null;   /* Посилання на правий дочірній вузол */

    // Конструктор вузла
    public TreeNode(Student data){
        this.data = data;
    }
}
