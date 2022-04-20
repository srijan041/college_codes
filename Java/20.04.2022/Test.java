
import java.applet.*;
import java.awt.*;

/*
<APPLET CODE = "Test" WIDTH =  HEIGHT = 200>
</APPLET>
*/

public class Test extends Applet {
    public void init() {
        Label one = new Label("One");
        Label two = new Label("Two");
        Label three = new Label("Three");
        add(one);
        add(two);
        add(three);

    }
}

//