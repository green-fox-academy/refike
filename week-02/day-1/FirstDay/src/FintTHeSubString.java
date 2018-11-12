import java.util.ArrayList;

public class FintTHeSubString {
    public static void main(String[] args) {
        //  Create a function that takes two strings as a parameter
        //  Returns the starting index where the second one is starting in the first one
        //  Returns `-1` if the second string is not in the first one

        //  Example:
        System.out.println(subStr("this is what I'm searching in", "searching"));
        //  should print: `17`
        System.out.println(subStr("this is what I'm searching in", "not"));
        //  should print: `-1`
    }


        public static int subStr(String a, String b){
            int j=0;
            int k =0;
            int index;

            for (int i = 0; i < a.length(); i++) {
                if (j < b.length()) {
                    char c = b.charAt(j);
                    char d = a.charAt(i);
                    if (c == d) {
                        j++;
                        k = i;
                    }
                }
            }

            if(j==0){
                return -1;
            }

            k = k- b.length()+1;
            return k;
        }
    }

