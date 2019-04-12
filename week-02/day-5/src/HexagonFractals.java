import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class HexagonFractals {
    public static void mainDraw(Graphics graphics) {

        int[] xPoints = {WIDTH / 4, WIDTH * 3 / 4, WIDTH, WIDTH * 3 / 4, WIDTH / 4, 0};
        int[] yPoints = {0, 0, HEIGHT / 2, HEIGHT, HEIGHT, HEIGHT / 2};
        int counter = 5;

        drawFractalHexagon1(counter, xPoints, yPoints, WIDTH, HEIGHT, 6, graphics);
        //drawFractalHexagon2(counter, xPoints, yPoints, WIDTH, HEIGHT, 6, graphics);
        //drawFractalHexagon3(counter, xPoints, yPoints, WIDTH, HEIGHT, 6, graphics);

    }

    public static void drawFractalHexagon1(int counter, int[] x, int[] y, int width, int height, int points, Graphics graphics) {

        int[] m = {x[0],x[1] - width / 4,x[2] - width * 3 / 8, x[3] - width / 4,x[4],  x[5] + width / 8};
        int[] n = {y[0], y[1], y[2] - height / 4, y[3] - height / 2, y[4] - height / 2, y[5] - height / 4};

        if (counter > 0) {

            graphics.drawPolygon(x, y, points);

            drawFractalHexagon1(counter - 1, m, n, width / 2, height / 2, points, graphics);
            drawFractalHexagon1(counter - 1, m, n, width / 2, height / 2, points, graphics);
        }
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