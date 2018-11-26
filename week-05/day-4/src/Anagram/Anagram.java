package Anagram;

import java.util.Arrays;

public class Anagram {


    public boolean isAnagram (String a, String b) {

        a = a.replaceAll(" ","");
        b = b.replaceAll(" ","");

        char[] charWord1 = a.toCharArray();
        char[] charWord2 = b.toCharArray();

        Arrays.sort(charWord1);
        Arrays.sort(charWord2);

        if (charWord1.length != charWord2.length) {
            System.out.println("Not the same size");
            return false;

        } else if (Arrays.equals(charWord1, charWord2)) {
            System.out.println("They are anagrams");
            return true;

        } else {
            System.out.println("They are not anagrams");
            return false;
        }
    }
}
