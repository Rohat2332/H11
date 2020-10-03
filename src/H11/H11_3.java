package H11;
import java.applet.*;
import java.awt.*;

public class H11_3 extends Applet {

    public void paint(Graphics g) {

        int counter;
        int y = 50;

        for(counter = 1; counter <= 1000;) {
            counter += counter;
            g.drawString("" + counter, 100, y);
            y += 20;
        }

    }

}