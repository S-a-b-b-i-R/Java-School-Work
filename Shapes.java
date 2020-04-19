// coded by Sabbir Ahmed @5035170112
import javax.swing.*;
import java.awt.*;

public class Shapes extends JPanel{
    private int choice;

    // constructor
    public Shapes(int choice){
        this.choice = choice;
    }

    // draw a cascade of shapes starting from the top-left corner
    public void paintComponent(Graphics g){
        for(int i=0; i<10; i++) {
            switch (choice) {
                case 1:
                    g.setColor(Color.RED);
                    g.drawRect(10 + i * 10, 10 + i * 10,
                            50 + i * 10, 50 + i * 10);
                    break;
                case 2:
                    g.setColor(Color.blue);
                    g.drawOval(10 + 1 * 10, 10 + i * 10,
                            50 + i * 10, 50 + i * 10);
                    break;
                case 3:
                    g.setColor(Color.GREEN);
                    g.drawLine(10 + 1 * 10, 10 + i * 10,
                            50 + i * 10, 10 + i * 10);
                    break;
            }
        }
    }
}
