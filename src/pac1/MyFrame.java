package pac1;

import javax.swing.*;

import java.awt.*;

public class MyFrame extends JFrame{
    JLabel label;
    ImageIcon icon;
    MyPanel panel;

    MyFrame() {
        panel = new MyPanel();
        this.setTitle("Graphics");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
