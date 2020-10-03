package H11;
import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdracht_1 extends Applet {

    TextField input;
    Button confirm;
    int number;

    public void init() {

        input = new TextField("",10);
        input.addActionListener(new Listener());

        confirm = new Button("ok");
        confirm.addActionListener(new Listener());

        add(input);
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
            String output = input.getText();
            number = Integer.parseInt(output);
            repaint();
        }
    }
}