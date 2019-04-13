import javax.swing.*;

import java.awt.*;
import java.sql.Array;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {
    public static void mainDraw(Graphics graphics) {
        // Draw the night sky:
        //  - The background should be black
        //  - The stars can be small squares
        //  - The stars should have random positions on the canvas
        //  - The stars should have random color (some shade of grey)

        graphics.fillRect(0, 0, WIDTH, HEIGHT);

        int numberOfStars = 200;
        int size = WIDTH / 40;

        for (int i = 0; i < numberOfStars; i++) {
            int x = (int) (Math.random() * (WIDTH - WIDTH / 40));
            int y = (int) (Math.random() * (HEIGHT - HEIGHT / 40));
            int randomColor = (int) (Math.random() * 256);

            drawStar(x, y, size, randomColor, graphics);
        }
    }

    public static void drawStar(int x, int y, int size, int color, Graphics graphics) {

        graphics.setColor(new Color(color, color, color));
        graphics.fillRect(x, y, size, size);
    }

    // Don't touch the code below
    static int WIDTH = 1000;
    static int HEIGHT = 1000;

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