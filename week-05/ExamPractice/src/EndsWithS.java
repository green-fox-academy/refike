import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EndsWithS {
    public static void main(String[] args) {


        /**
         * Create a method called `endsWithS` that takes a filename as a string
         * and returns the number of the words, that ends with 's'.
         *
         * Example cases:
         *
         * the correct output for the 'base.txt' is: 26
         * hint: Keep in mind that there may punctuation marks at the end of the words
         */

        System.out.println(endsWithS("C:\\Users\\Refike\\greenfox\\refike\\week-05\\ExamPractice\\src\\Words"));
    }

    public static int endsWithS(String fileName) {
        int number = 0;
        try {
            Path mypath = Paths.get(fileName);
            List<String> myList = Files.readAllLines(mypath);
            String mystring = "";
            for (String s : myList) {
                mystring += s;
            }

            List<String> splittedList = Arrays.asList(mystring.split(" "));
            for (String str : splittedList) {
                if (str.charAt(str.length() - 1) == 's') {
                    number++;

                } else if (str.charAt(str.length() - 1) == ';'
                        || str.charAt(str.length() - 1) == ':'
                        || str.charAt(str.length() - 1) == ','
                        || str.charAt(str.length() - 1) == '.'
                        || str.charAt(str.length() - 1) == '!'
                        || str.charAt(str.length() - 1) == '?') {
                    if (str.charAt(str.length() - 2) == 's') {
                        number++;
                    }
                }

            }


        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return number;
    }


}