package LeChat;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws IOException {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setTitle("LE CHAT");
        window.setSize(1000, 700);
        URL url = new URL("https://static.wikia.nocookie.net/warriors-cats/images/b/b8/%D0%A3%D0%B3%D0%BE%D0%BB%D1%91%D0%BA.png/revision/latest?cb=20181003043121&path-prefix=ru");
        BufferedImage intImageUnproc = ImageIO.read(url);
        Image intImage = /*intImageUnproc.getScaledInstance(100, 70, Image.SCALE_DEFAULT)*/ intImageUnproc;
        JLabel image = new JLabel(new ImageIcon(intImage));
        image.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Le Ashfur, yee", "Da King Ashfur", JOptionPane.WARNING_MESSAGE);
            }
        });
        window.add(image);
        window.setVisible(true);
    }
}
