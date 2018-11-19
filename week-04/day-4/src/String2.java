public class String2 {
    public static void main(String[] args) {
        // Given a string, compute recursively a new string where all the 'x' chars have been removed.

        System.out.println(myString("myxxfilmxxcoolxx"));
    }

    public static String myString (String input) {

        int index = input.indexOf("x");

        if(index < 0) {
            return input;
        }
            return myString(input.substring(0,index) + input.substring(index+1));
    }
}
