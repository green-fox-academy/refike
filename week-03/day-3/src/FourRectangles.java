import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics){
        // draw four different size and color rectangles.
        // avoid code duplication.
        for (int i = 0; i <4 ; i++) {

            int number1 = 249;
            int number2 = 300;
            int myFirstNum = (int)(Math.random()*(number1)+1);
            int mySecondNum = (int)(Math.random()*(number1)+1);
            int myThirdNum = (int)(Math.random()*(number1)+1);
            int paraX = (int)(Math.random()*(number2)+1);
            int paraY = (int)(Math.random()*(number2)+1);
            int widht = (int)(Math.random()*((number2-paraX)-10)+1)+10;
            int height = (int)(Math.random()*((number2-paraY)-10)+1)+10;


                graphics.setColor(new Color(myFirstNum, mySecondNum, myThirdNum));
                graphics.drawRect(paraX, paraY, widht, height);


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