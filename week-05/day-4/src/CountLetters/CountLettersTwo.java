package CountLetters;

import java.util.Arrays;
import java.util.HashMap;

public class CountLettersTwo {

    public HashMap countLetters(String myString) {
        HashMap<Character, Integer> myMap = new HashMap<>();

        char[] charWord1 = myString.toCharArray();

        for (char aCharWord1 : charWord1) {
            if (!myMap.containsKey(aCharWord1)) {
                myMap.put(aCharWord1, 1);
            } else {
                myMap.put(aCharWord1, myMap.get(aCharWord1) + 1);
            }
        }
        return myMap;
    }
}