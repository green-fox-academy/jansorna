import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GoToCenter {
    public static void mainDraw(Graphics graphics) {

        // Create a line drawing function that takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a line from that point to the center of the canvas.
        // Draw 3 lines with that function. Use loop for that.

        int numberOfLines = 3;

        for (int i = 0; i < numberOfLines; i++) {
            int x = (int)(Math.random()*WIDTH);
            int y = (int)(Math.random()*HEIGHT);
            toTheCenter(graphics,x, y, numberOfLines);
        }
    }

    public static void toTheCenter (Graphics graphics, int x, int y, int numberOfLines){

        int centerX = WIDTH/2;
        int centerY = HEIGHT/2;

        graphics.drawLine(x, y, centerX, centerY);
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
