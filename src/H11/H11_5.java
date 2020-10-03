package H11;
import java.applet.Applet;
import  java.awt.*;

public class H11_5 extends Applet {

    public void paint(Graphics g) {

        int counter;
        int x = 50;
        int y = 50;

        for(counter = 0; counter <= 5; counter++) {

            g.drawRect(x, y, 20, 20);
            x += 20;
            y += 20;

        }

    }

}