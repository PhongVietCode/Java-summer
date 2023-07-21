package pac1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyPanel extends JPanel implements ActionListener {

    final int PANEL_WIDTH = 500;
    final int PANEL_HEIGHT = 500;
    Image enemy;
    Image background;
    Image newBg;
    Timer timer;

    int xVelo = 2;
    int yVelo = 5;
    int x = 0;
    int y = 0;

    MyPanel() {
        enemy = new ImageIcon("miniCar.png").getImage();
        background = new ImageIcon("lisa.jpg").getImage();
        newBg = background.getScaledInstance(500, 500, Image.SCALE_FAST);
        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        this.setBackground(Color.black);
        timer = new Timer(10, this);
        timer.start();
    }

    public void paint(Graphics g) {
        super.paint(g); // paint background
        Graphics2D g2d = (Graphics2D) g; // cast to have more option
        g2d.drawImage(newBg, 0, 0, null);
        g2d.drawImage(enemy, x, y, null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (x >= PANEL_WIDTH - enemy.getWidth(null) || x < 0) {
            xVelo *= -1;
        }
        x = x + xVelo;
        repaint(); // redrawn the icon, implicit call the paint method 

        if (y >= PANEL_HEIGHT - enemy.getHeight(null) || y < 0) {
            yVelo *= -1;
        }   
        y = y + yVelo;
        repaint();
    }
}
