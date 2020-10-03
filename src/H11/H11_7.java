package H11;
import java.applet.*;
import java.awt.*;

public class H11_7 extends Applet {

    public void init() {
        setSize(550,550);
    }

    public void paint(Graphics g) {

        int counter;
        int height = 10;
        int width = 10;
        int x = 260;
        int y = 275;

        for(counter = 0; counter <= 50; counter++) {

            g.drawOval(x,y, width, height);
            height += 10;
            width += 10;
            x -= 5;
            y -= 5;

        }

    }

}