package Anagram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    Anagram anagram = new Anagram();

    @Test
    void testIsAnagram() {
        String a = "apple";
        String b = "paple";

        assertTrue(anagram.isAnagram(a,b));
    }

    @Test
    void testIsAnagramWithSpace() {
        String a = "apple";
        String b = "p a p l e";

        assertTrue(anagram.isAnagram(a,b));
    }
}