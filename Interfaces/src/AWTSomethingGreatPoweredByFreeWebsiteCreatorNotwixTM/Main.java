package AWTSomethingGreatPoweredByFreeWebsiteCreatorNotwixTM;

import com.sun.glass.ui.Screen;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {
    public static void main(String[] args) {
        Frame windowByPasha = new Frame("Thomas the  tank engine is gut !11!!");
        windowByPasha.setSize(1920, 480);
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        windowByPasha.setLocationRelativeTo(null);
        Button yeOldeButtonInnit = new Button();
        yeOldeButtonInnit.setBounds(10, 40, 1910, 60);
        yeOldeButtonInnit.setLabel("OK 19 DOLLARS FORTNITE CARD WHO WANTS IT AND YES IM GIVING IT AWAY AND TROLLS DONT GET BLOCKED");
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
