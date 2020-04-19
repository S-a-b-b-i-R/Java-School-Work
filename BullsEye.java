/* coded by Sabbir Ahmed 5035170112*/
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class BullsEye extends JPanel{
    Random randomColor = new Random();

    Color color1 = new Color(randomColor.nextInt(255),
            randomColor.nextInt(255),
            randomColor.nextInt(255));

    Color color2 = new Color(randomColor.nextInt(255),
            randomColor.nextInt(255),
            randomColor.nextInt(255));

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        int circleWidth = 200;
        int circleHeight = 200;

        int centerPosX = (getWidth() / 2) - circleWidth / 2;
        int centerPosY = (getHeight() / 2) - circleHeight / 2;

        // need to start from outside in else colours get overwrote
        for(int i=0; i<5; i++){

            if(i % 2 == 0)
                g.setColor(color1);
            else
                g.setColor(color2);

            g.fillOval(centerPosX, centerPosY, circleWidth, circleHeight);

            centerPosX += 20;
            centerPosY += 20;
            circleWidth -= 40;
            circleHeight -= 40;
        }
    }
}
