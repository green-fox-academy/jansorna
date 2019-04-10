import javax.swing.*;

import java.awt.*;

import static java.awt.Component.CENTER_ALIGNMENT;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 3 parameters:
        // The square size, the fill color, graphics
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.

        int numberOfSquares = 7;

        int size = (int)(100 + Math.random() * (WIDTH - 100));

        int widthOfColor = 20;

        for (int i = 0; i < numberOfSquares; i++) {

            size = size - (widthOfColor);

            int [] color = {148, 0, 211};

                if (i == 0) {
                    color = new int[]{148, 0, 211};
                }

                if (i == 1) {
                    color = new int[]{75, 0, 130};
                }

                if (i == 2) {
                    color = new int[]{0, 0, 255};
                }

                if (i == 3) {
                    color = new int[]{0, 255, 0};
                }

                if (i == 4) {
                    color = new int[]{255, 255, 0};
                }

                if (i == 5) {
                    color = new int[]{255, 127, 0};
                }

                if (i == 6) {
                    color = new int[]{255, 0 , 0};
                }

            ranbowMaker(graphics, size, color);
        }
    }

    public static void ranbowMaker(Graphics graphics, int size, int [] inputColor) {

        int firstColor = inputColor[0];
        int secondColor = inputColor[1];
        int thirdColor = inputColor[2];

        Color color = new Color(firstColor, secondColor, thirdColor);
        graphics.setColor(color);

        int centerX = WIDTH/2;
        int centerY = HEIGHT/2;

        graphics.fillRect(centerX - (size / 2), centerY - (size / 2), size, size);

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
