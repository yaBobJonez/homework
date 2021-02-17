package Technical;

import javax.swing.*;
import java.awt.*;

public abstract class Component extends Wrapper<JComponent> {
    private JComponent value;
    public abstract void paint(Graphics g);
}
