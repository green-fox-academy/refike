import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        //Create a function named is anagram following your current language's style guide
        // It should take two strings and return a boolean value depending on whether its an anagram or not.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me two words:");
        String askWord1 = scanner.nextLine();
        String askWord2 = scanner.nextLine();
        System.out.println(anagram(askWord1,askWord2));
    }

    public static boolean anagram(String word1, String word2) {
        char[] charWord1 = word1.toCharArray();
        char[] charWord2 = word2.toCharArray();
        Arrays.sort(charWord1);
        Arrays.sort(charWord2);

        if (charWord1.length != charWord2.length) {
            System.out.println(word1 + " and " + word2 + " doesn't have the same length");
            return false;

        }

        if (Arrays.equals(charWord1, charWord2)) {
            System.out.println("The two word are anagrams");
            return true;
        } else {
        }
        System.out.println("They are not anagrams");
        return false;
    }
}
