import javax.swing.*;
import java.awt.*;

public class GraphPanel extends JPanel{
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D gc = (Graphics2D)g;
        gc.setColor(Color.RED);
        gc.drawString("1", 5, 15);
        gc.drawString("2", 310, 15);
        gc.drawString("3", 310, 235);
        gc.drawString("4", 5, 235);
        gc.drawString("9", 155, 15);
        gc.drawString("5", 70, 70);
        gc.drawString("6", 240, 70);
        gc.drawString("7", 240, 185);
        gc.drawString("8", 70, 185);
        gc.drawString("10", 150, 70);
        gc.setColor(Color.BLACK);
        gc.drawLine(13, 12, 150, 12);
        gc.drawLine(163, 12, 307, 12);
        gc.drawLine(80, 65, 150, 65);
        gc.drawLine(165, 65, 235, 65);
        gc.drawLine(80, 178, 235, 178);
        gc.drawLine(13, 230, 307, 230);
        gc.drawLine(8, 18, 8, 222);
        gc.drawLine(77, 71, 237, 173);
        gc.drawLine(157, 18, 157, 58);
        gc.drawLine(313, 18, 313, 222);
        gc.drawLine(238, 70, 77, 173);
        gc.drawLine(10, 16, 68, 175);
        gc.drawLine(68, 67, 13, 227);
        gc.drawLine(308, 15, 248, 174);
        gc.drawLine(247, 68, 310, 224);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(320, 240);
    }

    public static void showGraph(){
        JFrame frame = new JFrame("Граф");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().add(new GraphPanel());
        frame.pack();
        frame.setVisible(true);
    }
}
