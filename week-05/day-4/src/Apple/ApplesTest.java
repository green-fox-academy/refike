package Apple;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplesTest {

    @Test
    void testGetApple() {
        Apples apples = new Apples("apple");

        String expected = "apple";
        assertEquals(expected,apples.getApple());
    }
}