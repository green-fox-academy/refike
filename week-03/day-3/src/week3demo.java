
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class week3demo {
    public static void mainDraw(Graphics graphics) {


        graphics.drawLine(60, 150, 65, 180);
        graphics.drawLine(65, 180, 60, 230);
        graphics.drawLine(60, 230, 80, 245);
        graphics.drawLine(80, 245, 90, 275);
        graphics.drawLine(90, 275, 100, 335);
        graphics.drawLine(100, 335, 90, 455);
        graphics.drawLine(90, 455, 160, 515);
        graphics.drawLine(160, 515, 190, 575);
        graphics.drawLine(190, 575, 220, 590);
        graphics.drawLine(220, 590, 255, 590);
        graphics.drawLine(255, 590, 260, 560);
        graphics.drawLine(260, 560, 210, 460);
        graphics.drawLine(225, 500, 255, 485);
        graphics.drawLine(255, 485, 450, 485);
        graphics.drawLine(450, 485, 460, 480);
        graphics.drawLine(390, 460, 490, 490);
        graphics.drawLine(490, 490, 505, 545);
        graphics.drawLine(505, 545, 515, 555);
        graphics.drawLine(515, 555, 565, 555);
        graphics.drawLine(565, 555, 575, 535);
        graphics.drawLine(575, 535, 545, 500);
        graphics.drawLine(545, 500, 480, 440);
        graphics.drawLine(480, 440, 430, 440);
        graphics.drawLine(430, 440, 410, 430);
        graphics.drawLine(410, 430, 390, 410);
        graphics.drawLine(390, 410, 290, 400);
        graphics.drawLine(290, 400, 285, 380);
        graphics.drawLine(285, 380, 255, 370);
        graphics.drawLine(255, 370, 210, 260);
        graphics.drawLine(210, 260, 200, 255);
        graphics.drawLine(200, 255, 160, 165);
        graphics.drawLine(160, 165, 135, 169);
        graphics.drawLine(135, 169, 80, 123);
        graphics.drawLine(80, 123, 60, 150);
        graphics.drawLine(120, 480, 70, 530);
        graphics.drawLine(70, 530, 120, 535);
        graphics.drawLine(120, 535, 130, 530);
        graphics.drawLine(130, 530, 140, 500);
        graphics.drawLine(105, 210, 35, 218);
        graphics.drawLine(105, 210, 35, 235);
        graphics.drawLine(105, 210, 35, 267);
        graphics.fillRect(141,196,8,8);

    }

    // Don't touch the code below
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


