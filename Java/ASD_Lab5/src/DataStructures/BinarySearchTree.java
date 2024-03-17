package DataStructures;

// Клас "Бінарне дерево пошуку" — оптимізація реалізована як RBT
public class BinarySearchTree {
    // Корінь дерева та відповідний гетер
    TreeNode root = null;
    public TreeNode getRoot() {
        return root;
    }

    // Методи вставляння нових студентів у дерево рекурсивно
    public void insert(Student student) {
        if (root != null) root = insert(root, student);
        else {
            root = new TreeNode(null, student);
            root.isRed = false;
        }
    }
    // Прапорці, які зазначають необхідність виконання ротацій
    boolean lRot, lrRot, rlRot, rRot;
    TreeNode insert(TreeNode node, Student student) {
        /*
         * Звичайна вставка вузла у бінарне дерево пошуку, після якої здійснюється перевірка
         * на конфлікт червоних кольорів з батьківським вузлом, відповідно до властивостей
         * червоно-чорного дерева.
         */
        boolean redRedConflict = false;
        if (node == null) return new TreeNode(null, student);
        else if (student.backlogsNumber < node.data.backlogsNumber) {
            node.left = insert(node.left, student);
            node.left.parent = node;
            if (node != root) redRedConflict = node.isRed && node.left.isRed;
        } else if (student.backlogsNumber > node.data.backlogsNumber) {
            node.right = insert(node.right, student);
            node.right.parent = node;
            if (node != root) redRedConflict = node.isRed && node.right.isRed;
        }
        /*
         * Якщо деякий вид ротації очікує виконання, це здійснюється на даному етапі.
         * L — ротація ліворуч; R — ротація праворуч;
         * LR — ротація ліворуч, а потім праворуч;
         * RL — ротація праворуч, а потім ліворуч.
         */
        if (lRot) {
            node = rotateLeft(node);
            node.isRed = false;
            node.left.isRed = true;
            this.lRot = false;
        } else if (lrRot) {
            node.left = rotateLeft(node.left);
            node.left.parent = node;
            node = rotateRight(node);
            node.isRed = false;
            node.right.isRed = true;
            this.lrRot = false;
        } else if (rlRot) {
            node.right = rotateRight(node.right);
            node.right.parent = node;
            node = rotateLeft(node);
            node.isRed = false;
            node.left.isRed = true;
            this.rlRot = false;
        } else if (rRot) {
            node = rotateRight(node);
            node.isRed = false;
            node.right.isRed = true;
            this.rRot = false;
        }
        // Вирішення конфлікту двох червоних елементів шляхом планування ротацій або перефарбовування
        if (redRedConflict) {
            if (node.parent.left == node) { // Якщо цей вузол (n) лівий
                if (node.parent.right == null || ! node.parent.right.isRed) { // Якщо дядько нового вузла чорний
                    if (node.left != null && node.left.isRed) rRot = true; // Якщо новий вузол лівий, то R
                    else if (node.right != null && node.right.isRed) lrRot = true; // Якщо новий вузол правий, то LR
                } else { // Якщо дядько нового вузла червоний, то перефарбувати вузли
                    node.parent.right.isRed = false;
                    node.isRed = false;
                    if (node.parent != root) node.parent.isRed = true;
                }
            } else { // Якщо цей вузол (n) правий
                if (node.parent.left == null || ! node.parent.left.isRed) { // Якщо дядько нового вузла чорний
                    if (node.left != null && node.left.isRed) rlRot = true; // Якщо новий вузол лівий, то RL
                    else if (node.right != null && node.right.isRed) lRot = true; // Якщо новий вузол правий, то L
                } else { // Якщо дядько нового вузла червоний, то перефарбувати вузли
                    node.parent.left.isRed = false;
                    node.isRed = false;
                    if (node.parent != root) node.parent.isRed = true;
                }
            }
        }
        return node;
    }

    /*
     *       Метод ротації ліворуч
     *        n                 a
     *      /   \             /   \
     *     o     a     ->    n     o
     *          / \         / \
     *         b   o       o   b
     */
    TreeNode rotateLeft(TreeNode node) {
        TreeNode a = node.right;
        TreeNode b = a.left;
        a.left = node;
        node.right = b;
        node.parent = a;
        if (b != null) b.parent = node;
        return a;
    }
    /*
     *       Метод ротації праворуч
     *          n              a
     *        /   \          /   \
     *       a     o   ->   o     n
     *      / \                  / \
     *     o   b                b   o
     */
    TreeNode rotateRight(TreeNode node) {
        TreeNode a = node.left;
        TreeNode b = a.right;
        a.right = node;
        node.left = b;
        node.parent = a;
        if (b != null) b.parent = node;
        return a;
    }

    /*
     * Метод пошуку значення за ключем (кількість заборгованостей):
     * здійснюється як для бінарного дерева пошуку — якщо значення менше, то перейти до лівого піддерева;
     * якщо більше, то — до правого; якщо ж рівне — елемент знайдений. Якщо дерево пройдено у висоту і
     * елемент стає null, значить такого елемента немає у дереві.
     */
    public Student search(int backlogsNumber) {
        TreeNode node = root;
        while (node != null) {
            if (backlogsNumber < node.data.backlogsNumber) node = node.left;
            else if (backlogsNumber > node.data.backlogsNumber) node = node.right;
            else return node.data;
        } return null;
    }

    /*
     * Метод перетворення дерева у рядок для виведення. Використовується обхід у ширину
     * через власну реалізацію черги (див. DataStructures/Queue) та форматування.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(String.format(" %11s | %9s | %12s %-12s | Курс | Місто | Телефон\n",
                "Підпорядк.", "Заборгов.", "Іʼя", "Прізвище"));
        sb.append(String.format("%s|%s|%s|------|-------|%s\n",
                "-".repeat(13), "-".repeat(11), "-".repeat(27), "-".repeat(9) ));
        Queue queue = new Queue();
        queue.enqueue(root);
        while (queue.head != null) {
            TreeNode next = queue.dequeue();
            if (next == root) sb.append("      Корінь | ");
            else sb.append(String.format(" %5s (%3d) | ",
                    next.parent.left == next? "Ліва" : "Права",
                    next.parent.data.backlogsNumber));
            sb.append(next.data).append("\n");
            if (next.left != null) queue.enqueue(next.left);
            if (next.right != null) queue.enqueue(next.right);
        } return sb.toString();
    }
}
