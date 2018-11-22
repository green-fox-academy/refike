package CountLetters;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class CountLettersTestTest {
    CountLetters countLetters = new CountLetters();

    @Test
    void myMethod() {
        String myString = "apple";
        HashMap<Character,Integer> myMap = new HashMap<>();
        myMap.put('a',1);
        myMap.put('p',2);
        myMap.put('l',1);
        myMap.put('e',1);

        assertEquals(myMap,countLetters.myMethod(myString));
    }
}