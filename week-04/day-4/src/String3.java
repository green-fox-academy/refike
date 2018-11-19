public class String3 {
    public static void main(String[] args) {
        // Given a string, compute recursively a new string where all the
        // adjacent chars are now separated by a "*".

        System.out.println(myString("redApple"));
    }

    public static String myString(String input) {

        if (input.length() ==0) {
            return "";
        }
        if ( 1 == input.length() ){
            return input;
        } else {
            return input.charAt(0) + "*" + myString(input.substring(1));
        }
    }
}