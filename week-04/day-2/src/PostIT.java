
import java.awt.*;

public class PostIT {


    Color backgroundColor;
    String text;
    Color textColor;

    public static void main(String[] args) {

        PostIT orange = new PostIT();
        orange.backgroundColor = Color.orange;
        orange.text = "Idea 1";
        orange.textColor = Color.blue;

        PostIT pink = new PostIT();
        pink.backgroundColor = Color.pink;
        pink.text = "Awesome";
        pink.textColor = Color.black;

        PostIT yellow = new PostIT();
        yellow.backgroundColor = Color.yellow;
        yellow.text = "Superb";
        yellow.textColor = Color.green;

    }
}
