import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics){
        // draw four different size and color rectangles.
        // avoid code duplication.

        int numberOfSquares = 4;

        for (int i = 0; i < numberOfSquares; i++) {

            int sizeX = (int)(Math.random()*WIDTH);
            int sizeY = (int)(Math.random()* HEIGHT);

            int x = (int)(Math.random()*(WIDTH - sizeX));
            int y = (int)(Math.random()* (HEIGHT - sizeY));

            Color color = new Color((int)(Math.random() * 256), (int)(Math.random() * 256), (int)(Math.random() * 256));

            graphics.setColor(color);

            squareMaker(graphics,x, y, sizeX, sizeY);
        }
    }

    public static void squareMaker(Graphics graphics, int x, int y, int sizeX, int sizeY) {

        graphics.drawRect(x, y, sizeX, sizeY);

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
