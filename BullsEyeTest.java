/* coded by Sabbir Ahmed 5035170112*/
import javax.swing.JFrame;

public class BullsEyeTest extends JFrame{
    public static void main(String[] args){
        BullsEye panel = new BullsEye();

        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(250, 250);
        application.setVisible(true);
    }
}
