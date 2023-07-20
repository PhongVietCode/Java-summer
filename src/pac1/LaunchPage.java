package pac1;
import javax.swing.JButton;
import javax.swing.JFrame;

public class LaunchPage {
    JFrame frame = new JFrame();
    JButton myButton = new JButton(); 

    LaunchPage() {
        myButton.setBounds(100, 160, 200, 40);
        myButton.setFocusable(false);
        myButton.addActionListener(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);

    }
}
