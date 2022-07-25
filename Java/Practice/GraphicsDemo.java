import java.applet.Applet;
import java.awt.*;

public class GraphicsDemo extends Applet{
    public void paint(Graphics g){
        g.setColor(Color.red);
        g.drawString("Hello", 50, 50);
    }
}
