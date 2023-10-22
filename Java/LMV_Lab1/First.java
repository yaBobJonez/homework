import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class First {
    public static void main(String[] args) {
        JFrame win = new JFrame("Друк фото");
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setLocationRelativeTo(null);
        ((JPanel)win.getContentPane()).setBorder(new EmptyBorder(10, 10, 10, 10));
            JList size = new JList<>(new String[]{ "10x15", "15x21", "20x30", "30x40", "30x45", "30x60" });
            win.add(size, BorderLayout.WEST);
            JPanel rcol = new JPanel();
            rcol.setLayout(new BoxLayout(rcol, BoxLayout.Y_AXIS));
            rcol.setBorder(new EmptyBorder(0, 10, 0, 0));
                JLabel labelAmount = new JLabel("Кількість:");
                labelAmount.setAlignmentX(Component.LEFT_ALIGNMENT);
                rcol.add(labelAmount);
                JSpinner amount = new JSpinner(new SpinnerNumberModel(1, 1, 10000, 1));
                amount.setAlignmentX(Component.LEFT_ALIGNMENT);
                rcol.add(amount);
                rcol.add(Box.createVerticalGlue());
                JLabel sum = new JLabel("Сума: -");
                sum.setAlignmentX(Component.LEFT_ALIGNMENT);
                rcol.add(sum);
                JLabel costPerOne = new JLabel("Вартість 1 шт: -");
                costPerOne.setAlignmentX(Component.LEFT_ALIGNMENT);
                rcol.add(costPerOne);
                JLabel discount = new JLabel("Знижка: -");
                discount.setAlignmentX(Component.LEFT_ALIGNMENT);
                rcol.add(discount);
                rcol.add(Box.createVerticalGlue());
            rcol.setAlignmentX(Component.LEFT_ALIGNMENT);
            win.add(rcol, BorderLayout.EAST);
        win.pack();
        win.setVisible(true);
    }
}
