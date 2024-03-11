package DataStructures;

// Клас, що описує вузол бінарного дерева
public class TreeNode {
    TreeNode parent;                /* Посилання на батьківський вузол */
    boolean isRed = true;           /* Колір вузла (чи є він червоним) */
    public Student data;            /* Студент, що зберігається у вузлі */
    public TreeNode left = null;    /* Посилання на лівий дочірній вузол */
    public TreeNode right = null;   /* Посилання на правий дочірній вузол */

    // Конструктор вузла
    public TreeNode(TreeNode parent, Student data){
        this.parent = parent;
        this.data = data;
    }
}
