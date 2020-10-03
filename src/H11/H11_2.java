package H11;
import java.applet.*;
import java.awt.*;

public class H11_2 extends Applet {

    public void paint(Graphics g) {

        int counter;
        int y = 20;

        for(counter = 20; counter >= 10; counter--) {
            g.drawString("" + counter, 100, y);
            y += 20;
        }
    }

}