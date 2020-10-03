package H11;
import java.applet.*;
import java.awt.*;

public class H11_8 extends Applet {

    public void init() {
        setSize(600,600);
    }

    public void paint(Graphics g) {

        int counter;
        int height = 5;
        int width = 5;
        int colorcounter = 1;


        for(counter = 0; counter <= 100; counter++) {

            switch(colorcounter) {
                case 1:
                    g.setColor(Color.magenta);
                    ++colorcounter;
                    break;
                case 2:
                    g.setColor(Color.red);
                    ++colorcounter;
                    break;
                case 3:
                    g.setColor(Color.orange);
                    ++colorcounter;
                    break;
                case 4:
                    g.setColor(Color.yellow);
                    ++colorcounter;
                    break;
                case 5:
                    g.setColor(Color.cyan);
                    colorcounter = 1;
                    break;
            }

            g.drawOval(10,10, width, height);
            height += 5;
            width += 5;

        }

    }


}