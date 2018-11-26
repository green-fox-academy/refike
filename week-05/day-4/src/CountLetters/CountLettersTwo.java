package CountLetters;

import java.util.Arrays;
import java.util.HashMap;

public class CountLettersTwo {

    public HashMap countLetters(String myString) {
        HashMap<Character, Integer> myMap = new HashMap<>();

        char[] charWord1 = myString.toCharArray();

        for (int i = 0; i < charWord1.length; i++) {
            if (!myMap.containsKey(charWord1[i])) {
                myMap.put(charWord1[i],1);
            } else {
                myMap.put(charWord1[i], myMap.get(charWord1[i])+1);
            }
        }
        return myMap;
    }
}