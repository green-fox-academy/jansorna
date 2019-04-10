import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3d {
    public static void mainDraw(Graphics graphics) {
        // Reproduce this:
        // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/purple-steps-3d/r4.png]

        int howManySquares = 6;
        int size = 10;
        int positionOfSquare = 10;
        double multiplayer = 1.5;

        for (int i = 0; i < howManySquares; i++) {

            purplesteps3d(graphics, positionOfSquare, size);

            positionOfSquare = positionOfSquare + size;
            size = (int)(size * multiplayer);
        }

    }

    public static void purplesteps3d (Graphics graphics, int position, int size) {

        graphics.setColor(Color.MAGENTA);
        graphics.fillRect(position, position, size, size);

        graphics.setColor(Color.BLACK);
        graphics.drawRect(position, position, size, size);

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