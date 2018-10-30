import java.util.Arrays;

public class AppendASecond {
    public static void main(String[] args) {
        // - Create an array variable named `animals`
        //   with the following content: `["koal", "pand", "zebr"]`
        // - Add all elements an `"a"` at the

        String[] animals = {"koal", "pand", "zebr"};

        for (int i =0; i<animals.length; i++)
        System.out.println(appendAFunc(animals[i]));
        }
    public static String appendAFunc (String string) {

        return string+"a";
    }
}

