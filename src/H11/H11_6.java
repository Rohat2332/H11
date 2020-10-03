package H11;
import java.applet.*;
import java.awt.*;

public class H11_6 extends Applet {

    public void paint(Graphics g) {

        int counter;
        int height = 10;
        int width = 10;
        int x = 200;
        int y = 150;

        for(counter = 0; counter <= 5; counter++) {

            g.drawOval(x,y, width, height);
            height += 10;
            width += 10;
            x -= 5;
            y -= 5;


        }

    }

}