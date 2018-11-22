package CountLetters;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CountLettersTwoTest {
    CountLettersTwo countTwo = new CountLettersTwo();

    @Test
    void myMethod() {
    String myString = "apple";
        HashMap<Character,Integer> myMap = new HashMap<>();
        myMap.put('a',1);
        myMap.put('p',2);
        myMap.put('l',1);
        myMap.put('e',1);

        assertEquals(myMap,countTwo.myMethod(myString));

    }
}