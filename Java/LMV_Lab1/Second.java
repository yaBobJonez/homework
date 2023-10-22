import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Second {
    public static void main(String[] args) {
        JFrame win = new JFrame("Друк фото");
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setLocationRelativeTo(null);
        ((JPanel)win.getContentPane()).setBorder(new EmptyBorder(10, 10, 10, 10));
        ((JPanel)win.getContentPane()).setLayout(new GridLayout(6, 3, 7, 7));
            JLabel labelSize = new JLabel("Розмір:"); labelSize.setAlignmentX(Component.LEFT_ALIGNMENT); win.add(labelSize);
            win.add(new JLabel(""));
            win.add(new JLabel(""));
            JComboBox<String> size = new JComboBox<>(new String[]{"10x15", "15x21", "20x30", "30x40", "30x45", "30x60", "Інший"}); win.add(size);
            JTextField width = new JTextField("w"); width.setAlignmentX(Component.LEFT_ALIGNMENT); win.add(width);
            JTextField height = new JTextField("h"); width.setAlignmentX(Component.LEFT_ALIGNMENT); win.add(height);
            JLabel labelMat = new JLabel("Матеріал:"); labelMat.setAlignmentX(Component.LEFT_ALIGNMENT); win.add(labelMat);
            JLabel labelAmo = new JLabel("Кількість:"); labelAmo.setAlignmentX(Component.LEFT_ALIGNMENT); win.add(labelAmo);
            JLabel labelDis = new JLabel("Знижка:"); labelDis.setAlignmentX(Component.LEFT_ALIGNMENT); win.add(labelDis);
            JComboBox<String> material = new JComboBox<>(new String[]{"Офсетний папір", "Крейдований папір", "Дизайн. картон"}); win.add(material);
            JSpinner amount = new JSpinner(new SpinnerNumberModel(1, 1, 10000, 1)); win.add(amount);
            JSpinner discount = new JSpinner(new SpinnerNumberModel(0, 0, 5000, 0.01)); win.add(discount);
            JButton calc = new JButton("Обчислити"); win.add(calc);
            JLabel sum = new JLabel("Сума: -"); sum.setAlignmentX(Component.LEFT_ALIGNMENT); win.add(sum);
            JLabel unitPrice = new JLabel("Вартість 1 шт: -"); sum.setAlignmentX(Component.LEFT_ALIGNMENT); win.add(unitPrice);
        win.pack();
        win.setVisible(true);
    }
}
