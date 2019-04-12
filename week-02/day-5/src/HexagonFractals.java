import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class HexagonFractals {
    public static void mainDraw(Graphics graphics) {

        int x0 = WIDTH / 4;
        int x1 = WIDTH * 3 / 4;
        int x2 = WIDTH;
        int x3 = WIDTH * 3 / 4;
        int x4 = WIDTH / 4;
        int x5 = 0;

        int y0 = 0;
        int y1 = 0;
        int y2 = HEIGHT / 2;
        int y3 = HEIGHT;
        int y4 = HEIGHT;
        int y5 = HEIGHT / 2;

        int counter = 5;

        drawFractalHexagon(counter, x0, x1, x2, x3, x4, x5, y0, y1, y2, y3, y4, y5, WIDTH, HEIGHT, 6, graphics);
    }

    public static void drawFractalHexagon(int counter, int x0, int x1, int x2, int x3, int x4, int x5, int y0, int y1, int y2, int y3, int y4, int y5, int width, int height, int points, Graphics graphics) {

        if (counter > 0) {
            int[] x = {x0, x1, x2, x3, x4, x5};
            int[] y = {y0, y1, y2, y3, y4, y5};

            graphics.drawPolygon(x, y, points);

            drawFractalHexagon(counter - 1, x0, x1 - width / 4, x2 - width * 3 / 8, x3 - width / 4, x4, x5 + width / 8, y0, y1, y2 - height / 4, y3 - height / 2, y4 - height / 2, y5 - height / 4, height / 2, width / 2, points, graphics);
            drawFractalHexagon(counter - 1, x0, x1 - width / 4, x2 - width * 3 / 8, x3 - width / 4, x4, x5 + width / 8, y0 + height / 2, y1 + height / 2, y2 + height / 4, y3, y4, y5 + height / 4, height / 2, width / 2, points, graphics);
            drawFractalHexagon(counter - 1, x0 + width * 3 / 8, x1 + width / 8, x2, x3 + width / 8, x4 + width * 3 / 8, x5 + width / 2, y0 + height / 4, y1 + height / 4, y2, y3 - height / 4, y4 - height / 4, y5, height / 2, width / 2, points, graphics);
        }
    }

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