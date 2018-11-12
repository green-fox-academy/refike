import javax.swing.*;

import java.awt.*;

import static java.awt.image.ImageObserver.HEIGHT;
import static java.awt.image.ImageObserver.WIDTH;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {
    public static void mainDraw(Graphics graphics) {


        for (int a = 0; a < HEIGHT; a+=40  ) {
            for (int j = 0; j < WIDTH; j += 40  ) {

                for (int i = 20; i < WIDTH - 20; i += 20 ) {

                    graphics.setColor(new Color(138, 43, 226));

                    graphics.drawLine(i / 8 + j, 0 + a , WIDTH / 8 + j, i / 8 + a);

                    graphics.setColor(Color.GREEN);

                    graphics.drawLine(0 + j, i / 8 + a, i / 8 + j, WIDTH / 8 + a);

                }


            }

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