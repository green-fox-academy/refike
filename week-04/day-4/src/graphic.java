import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class graphic {

    public static void mainDraw (Graphics graphics) {
        drawSquare(graphics,WIDTH,0,0);
    }

    public static void drawSquare(Graphics graphics, int size, int x, int y) {

        if (size <= 0) {
            return;

        } else {

            graphics.drawRect(x + size / 3, y, size / 3, size / 3); //felső
            graphics.drawRect(x + size / 3, y + size * 2 / 3, size / 3, size / 3); //also
            graphics.drawRect(x + size * 2 / 3, y + size / 3, size / 3, size / 3); //jobb
            graphics.drawRect(x, y + size / 3, size / 3, size / 3); //bal

            drawSquare(graphics, size / 3, x + size / 3, y); //felso
            drawSquare(graphics, size / 3, x + size / 3, y + size * 2 / 3); // also
            drawSquare(graphics, size / 3, x + size * 2 / 3, y + size / 3); // jobb
            drawSquare(graphics, size / 3, x, y + size / 3); // bal

        }
    }
    static int WIDTH = 600;
    static int HEIGHT = 600;

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