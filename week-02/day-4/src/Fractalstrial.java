import javax.swing.*;

import java.awt.*;
import java.util.HashMap;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Fractalstrial {
    public static void mainDraw(Graphics graphics) {

        graphics.setColor(Color.YELLOW);
        graphics.fillRect(0,0,320, 320);
        graphics.setColor(Color.BLACK);

        int number = 3;

        graphics.drawRect(WIDTH/3, 0, WIDTH/3, HEIGHT/3);

        drawFractal(graphics, number);
    }

    public static void drawFractal (Graphics graphics, int n){

        if (n == 21) {
            return;
        }

        graphics.drawRect(WIDTH/3 + WIDTH/3/n, 0, WIDTH/3/n, HEIGHT/3/n);

        drawFractal(graphics, n +3);
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}
