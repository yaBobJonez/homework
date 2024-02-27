package DataStructures;

// Клас "Бінарне дерево"
public class BinaryTree {
    TreeNode root = null;   /* Корінь дерева з відповідним гетером */
    public TreeNode getRoot(){ return this.root; }

    /* Конструктор без параметрів вже існує у Java автоматично, якщо немає інших конструкторів */

    /*
     * Методи рекурсивного додавання вузла до бінарного дерева пошуку:
     * якщо корінь порожній, то створити його; інакше рекурсивно порівнювати номер квитка нового
     * студента, і якщо він менший, то додати лівіше вузла, а якщо більший, то додати правіше.
     * У випадку наявності у дереві такого вузла лише повертається false.
     */
    public boolean add(Student student){
        if (this.root != null) return this.add(this.root, student);
        this.root = new TreeNode(student);
        return true;
    }
    boolean add(TreeNode node, Student student){
        int comp = student.compareTo(node.data);
        if (comp < 0){
            if (node.left != null) return this.add(node.left, student);
            node.left = new TreeNode(student);
            return true;
        } else if (comp > 0){
            if (node.right != null) return this.add(node.right, student);
            node.right = new TreeNode(student);
            return true;
        } else return false;
    }

    /*
     * Методи рекурсивного видалення студентів 4-го курсу, що не мають стипендії:
     * використовується зворотний обхід (від листків до кореня) і у випадку виконання умови
     * розглядаються такі випадки: коли один з синів відсутній — повертається інший, що також
     * покриває випадок відсутності обох; коли є обидва сини — знаходиться наступний елемент
     * та його батько, він видаляється з ієрархії, а поточний вузол заміщується наступним.
     */
    public void remove(){
        this.remove(this.root);
    }
    TreeNode remove(TreeNode node){
        if (node == null) return null;
        node.left = this.remove(node.left);
        node.right = this.remove(node.right);
        if (node.data.course == 4 && ! node.data.scholarship){
            if (node.left == null) return node.right;
            if (node.right == null) return node.left;
            TreeNode succPar = node, succ = node.right;
            while (succ.left != null){
                succPar = succ;
                succ = succ.left;
            }
            if (node.right != succ) succPar.left = succ.right;
            else succPar.right = succ.right;
            node.data = succ.data;
        }
        return node;
    }

    /*
     * Методи приведення бінарного дерева у рядок для виведення
     * з використанням StringBuilder та форматування, рекурсивно.
     */
    @Override
    public String toString(){
        if (this.root == null) return "Дерево не містить елементів.\n";
        else return this.toString(this.root, this.root);
    }
    String toString(TreeNode node, TreeNode parent){
        StringBuilder sb = new StringBuilder();
        if (node.left != null) sb.append(this.toString(node.left, node));
        if (node == parent) {
            sb.append(String.format("%18s ", "Корінь"));
        } else {
            sb.append(String.format("%5s ", node == parent.left? "Ліва" : "Права"));
            sb.append("(").append(String.format("%10s", parent.data.studentCard)).append(") ");
        } sb.append(node.data).append("\n");
        if (node.right != null) sb.append(this.toString(node.right, node));
        return sb.toString();
    }
}
