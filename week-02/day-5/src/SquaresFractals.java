import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SquaresFractals {
    public static void mainDraw(Graphics graphics) {

        int x = 0;
        int y = 0;

        int counter = 9;

        graphics.setColor(Color.YELLOW);
        graphics.fillRect(0,0, WIDTH, HEIGHT);

        graphics.setColor(Color.BLACK);

        drawSquares(counter, x, y, WIDTH, HEIGHT, graphics);
    }

    public static void drawSquares (int counter, int x, int y, int width, int height, Graphics graphics){

        if (counter > 0){

           graphics.drawRect (x, y, width, height);

           drawSquares(counter -1, x + width/3, y, width/3, height/3, graphics);

           drawSquares(counter -1, x + width/3, y + height * 2 / 3, width/3, height/3, graphics);

           drawSquares(counter -1, x, y + height/3, width/3, height/3, graphics);

           drawSquares(counter -1, x + width * 2 / 3, y + height/3, width/3, height/3, graphics);

        }
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