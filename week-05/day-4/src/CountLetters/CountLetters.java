package CountLetters;

import java.util.Arrays;
import java.util.HashMap;

public class CountLetters {

    public HashMap myMethod(String myString) {
        HashMap<Character, Integer> myMap = new HashMap<>();
        int counter = 0;
        char[] charWord1 = myString.toCharArray();

        for (int i = 0; i < charWord1.length; i++) {
            for (int j = 0; j < charWord1.length; j++) {
                if (charWord1[i] == charWord1[j]) {
                    counter++;

                }

                myMap.put(charWord1[i], counter);

            }
            counter = 0;

        }
        return myMap;

    }
}