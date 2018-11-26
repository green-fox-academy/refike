package Extension;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Extension {

    int add(int a, int b) {
        int sum = a+b;
        return sum;
    }

    int maxOfThree(int a, int b, int c) {
        int[] myArray = {a,b,c,};
        int max = 0;
        for (int i = 0; i <myArray.length ; i++) {
            if(myArray[i] > max) {
                max = myArray[i];
            }
        }
        return max;
    }

    int median(List<Integer> pool) {
        Collections.sort(pool);
        return pool.get((pool.size()-1)/2);
    }

    boolean isVowel(char c) {

        return Arrays.asList('a', 'u', 'o', 'e', 'i').contains(c);
    }

    String translate(String hungarian) {
        String teve = "";
        for (int i = 0; i < hungarian.length(); i++) {
            char c = hungarian.charAt(i);
            if (isVowel(c)) {
                teve = teve + c + "v" + c;
            } else {
                teve = teve + c;
            }
        }
        return teve;
    }
}