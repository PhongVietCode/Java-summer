package pac1;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JFrame frame = new JFrame();
    JButton button = new JButton();
    JLabel label2 = new JLabel();

    MyFrame() {
        ImageIcon image = new ImageIcon("logo.jpg");
        ImageIcon car = new ImageIcon("car.png");
        ImageIcon miniCar = new ImageIcon("miniCar.png");
        JLabel label = new JLabel();
        Border border = BorderFactory.createLineBorder(Color.YELLOW);
        label2.setIcon(miniCar);
        label2.setVisible(false);
        label2.setBounds(200, 300, 100, 100);
        this.frame.add(label2);
        label.setText("Helo babyyyyyyyy!");
        label.setIcon(car);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.white);
        label.setFont(new Font("MV Boli", Font.PLAIN, 25));
        label.setIconTextGap(-25);
        label.setBackground(Color.CYAN);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon + text in the label.
        label.setHorizontalAlignment(JLabel.CENTER); // set vertical position of icon + text in the label.
        label.setBounds(40, 200, 300, 300); // set position correct for the label

        this.frame.setTitle("Phong cute dau phong van");
        this.frame.setSize(600, 600);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setResizable(false);
        this.frame.setVisible(true);
        this.frame.setIconImage(image.getImage());
        this.frame.getContentPane().setBackground(new Color(139, 61, 255));
        // this.frame.add(label);
        this.frame.setLayout(null); // to manually set the size of the label
        JPanel redpanel = new JPanel();
        redpanel.setBackground(Color.red);
        redpanel.setPreferredSize(new Dimension(100, 100));
        JPanel bluepanel = new JPanel();
        bluepanel.setBackground(Color.blue);
        bluepanel.setPreferredSize(new Dimension(100, 100));

        // button
        button.setBounds(350, 300, 200, 100);
        button.setText("Click me");
        button.setIcon(miniCar);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.addActionListener(this);
        button.setFont(new Font("Comic Sans", Font.BOLD, 20));
        button.setIconTextGap(-1);
        button.setFocusable(false);
        button.setBackground(Color.DARK_GRAY);
        button.setForeground(Color.cyan);
        button.setBorder(BorderFactory.createEtchedBorder());
        this.frame.add(button);
        this.frame.setLayout(new BorderLayout(10,10));
        frame.add(redpanel, BorderLayout.NORTH);
        frame.add(bluepanel, BorderLayout.EAST);
        frame.add(label, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("phongcute");
            button.setEnabled(false);
            label2.setVisible(true);
        }
    }

}
