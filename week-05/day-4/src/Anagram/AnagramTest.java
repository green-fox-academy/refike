package Anagram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    Anagram anagram = new Anagram();

    @Test
    void testIsAnagram() {
        String a = "apple";
        String b = "p aple";

        assertTrue(anagram.isAnagram(a,b));
    }
}