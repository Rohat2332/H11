package H11;
import java.applet.*;
import java.awt.*;

public class H11_1 extends Applet {

    public void paint(Graphics g) {
        int teller;
        int y = 0;

        for (teller = 0; teller <= 10; teller++) {
            y += 30;
            g.drawLine(100, y, 200, y);
        }
    }

}