import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.CaretEvent;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MyInformation {

    private static JFrame mainFrame;
    private static JPanel mainPanel, field1Panel, field2Panel, areaPanel;
    private static JLabel nameLabel, passLabel, imgLabel;
    private static JTextField nameField, displayField;
    private static JPasswordField passField;
    private static JTextArea textArea1, textArea2;
    private static JButton copyButton;
    private static final String IMG_PATH = "src/images/img.jpg";
    private static String selectedText = "";

    public static void main(String[] args) {
        mainFrame = new JFrame("My Information");
        mainPanel = new JPanel();

        field1Panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        nameLabel = new JLabel("Name: ");
        nameField = new JTextField(15);
        passLabel = new JLabel("Password: ");
        passField = new JPasswordField(15);
        try {
            BufferedImage buffImg = ImageIO.read(new File(IMG_PATH));
            ImageIcon icon = new ImageIcon(buffImg);
            imgLabel = new JLabel(icon);
            imgLabel.setPreferredSize(new Dimension(100, 100));
        } catch (IOException e) {
        }
        field1Panel.add(nameLabel);
        field1Panel.add(nameField);
        field1Panel.add(passLabel);
        field1Panel.add(passField);
        field1Panel.add(imgLabel);

        field2Panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        displayField = new JTextField(30);
        displayField.setEditable(false);
        field2Panel.add(displayField);

        areaPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        textArea1 = new JTextArea(10, 15);
        textArea1.setText("This is a string to be selected,");
        textArea1.setLineWrap(true);
        copyButton = new JButton("Copy>>>");
        textArea2 = new JTextArea(10, 15);
        textArea2.setEditable(false);
        textArea2.setLineWrap(true);
        areaPanel.add(textArea1);
        areaPanel.add(copyButton);
        areaPanel.add(textArea2);

        mainPanel.add(field1Panel);
        mainPanel.add(field2Panel);
        mainPanel.add(areaPanel);

        mainFrame.add(mainPanel);
        mainFrame.setSize(600, 400);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setResizable(false);
        mainFrame.setVisible(true);

// action listeners for all the components
        nameField.addKeyListener(new KeyAdapter()
        {
            @Override
            public void keyPressed(KeyEvent e)
            {
                if(e.getKeyCode() == KeyEvent.VK_ENTER)
                {
                    displayField.setText("name: "+nameField.getText().trim());
                }
            }
        });

        passField.addKeyListener(new KeyAdapter()
        {
            @Override
            public void keyPressed(KeyEvent e)
            {
                if(e.getKeyCode() == KeyEvent.VK_ENTER)
                {
                    displayField.setText("password:"+passField.getText().trim());
                }
            }
        });

        textArea1.addCaretListener((CaretEvent e) -> {
            int dot = e.getDot();
            int mark = e.getMark();
            if(dot != mark)
                selectedText = textArea1.getSelectedText();
            else
                selectedText = "";
        });

        copyButton.addActionListener((ActionEvent e) -> {
            textArea2.setText(selectedText);
        });

    }
}
