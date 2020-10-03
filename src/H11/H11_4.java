package H11;
import java.applet.*;
import java.awt.*;

public class H11_4 extends Applet {

    public void paint(Graphics g) {
        int counter;
        int y = 50;
        int result = 0;

        for(counter = 0; counter <= 10; counter++) {
            result = 3 * counter;
            g.drawString("" + result, 100, y);
            y += 20;
        }

    }

}