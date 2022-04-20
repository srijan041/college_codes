import java.awt.*;
import java.applet.*;

public class Demo extends Applet {

    public void init() {
        setForeground(Color.white);
        setBackground(Color.blue);
    }

    public void paint(Graphics g) {
        g.drawString("Welcome To Java Applet", 40, 50);
    }
}
