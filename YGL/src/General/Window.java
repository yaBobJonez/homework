package General;

import Technical.Wrapper;

import javax.swing.*;
import java.awt.*;

public class Window extends Wrapper<JFrame> {
    private JFrame value;
    public Window(int w, int h, String title, Image icon) {
        this.value = new JFrame();
        this.value.setSize(w, h);
        this.value.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.value.setLocationRelativeTo(null);
        this.value.setLayout(null);
        if(icon != null) this.value.setIconImage(new ImageIcon(icon).getImage()); else {
            try { this.value.setIconImage( new ImageIcon(Wrapper.class.getResource("DefaultIcon.png")).getImage() ); }
            catch(Exception e){ System.err.println("[Error] Default icon didn't load."); }
        } this.value.setTitle(title);
        this.value.setVisible(true);
    } public Window(int w, int h, String title){
        this(w, h, title, null);
    }public Window(int w, int h){
        this(w, h, "", null);
    }
}
