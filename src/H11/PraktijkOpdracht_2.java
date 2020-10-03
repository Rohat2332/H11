package H11;
import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdracht_2 extends Applet {

    Button confirm;
    int number = 1;

    public void init() {

        confirm = new Button("Ok");
        confirm.addActionListener(new Listener());
        add(confirm);

    }
    public void paint(Graphics g) {
        int result;
        int counter;
        int y = 40;

        for(counter = 1; counter <= 10; counter++) {
            result = number * counter;
            y += 20;
            g.drawString(""+ number + " x " + counter + "= " + result,40,y);
        }
    }
    class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (number < 10) {
                number++;
            } else {
                number = 1;
            }
            repaint();
        }
    }
}