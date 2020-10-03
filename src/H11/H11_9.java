package H11;
import java.applet.*;
import java.awt.*;

public class H11_9 extends Applet {

    public void paint(Graphics g) {

        int counter;
        int white = 0;
        int row = 0;
        int x = 20;
        int y = 20;
        int width = 20;
        int height = 20;


        for(counter = 0; counter < 64;) {
            if (row < 8) {
                if (white < 1) {
                    g.setColor(Color.black);
                    g.fillRect(x,y,width,height);
                    y += 20;
                    white++;
                    row++;
                    counter++;
                } else {
                    g.setColor(Color.white);
                    g.fillRect(x,y,width,height);
                    y += 20;
                    white--;
                    row++;
                    counter++;
                }

            } else {
                x += 20;
                y = 20;
                row = 0;
                if (white == 1) {
                    white = 0;
                } else {
                    white = 1;
                }
            }

        }
        g.setColor(Color.black);
        g.drawRect(20,20,160,160);

    }

}