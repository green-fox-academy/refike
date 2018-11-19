public class String1 {
    public static void main(String[] args) {
        // Given a string, compute recursively (no loops) a new string where all the
        // lowercase 'x' chars have been changed to 'y' chars.

        System.out.println(myString("myxxxshirt"));
    }

    public static String myString (String input) {
        int index = input.indexOf("x");

        if(index < 0) {
            return input;
        }

        return myString(input.substring(0,index) + "y" + input.substring(index+1));
    }
}


