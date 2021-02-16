package AWTSomethingGreatPoweredByFreeWebsiteCreatorNotwixTM;

import com.sun.glass.ui.Screen;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {
    public static void main(String[] args) {
        Frame windowByPasha = new Frame("Thomas the  tank engine is gut !11!!");
        windowByPasha.setSize(640, 480);
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        windowByPasha.setLocationRelativeTo(null);
        Button yeOldeButtonInnit = new Button();
        yeOldeButtonInnit.setBounds(10, 40, 110, 60);
        yeOldeButtonInnit.setLabel("Going low-level");
        windowByPasha.add(yeOldeButtonInnit);
        windowByPasha.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                windowByPasha.dispose();
            }
        }); windowByPasha.setLayout(null);
        windowByPasha.setVisible(true);
    }
}
