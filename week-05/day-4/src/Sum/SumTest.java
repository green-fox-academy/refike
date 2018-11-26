package Sum;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {
    private ArrayList<Integer> myList;
    Sum sum = new Sum();

    @BeforeEach
    void setUP() {
        myList = new ArrayList<Integer>();
    }
    @Test
    void testSumOfElements() {
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);

        Integer expected = 15;
        assertEquals(expected, sum.sumOfElements(myList));
    }
    @Test
    void testSumOneElement() {
        myList.add(3);
        Integer expected = 3;
        assertEquals(expected, sum.sumOfElements(myList));

    }
    @Test
    void testSumZeroValueElements() {
        myList.add(0);
        myList.add(0);
        Integer expected = 0;
        assertEquals(expected, sum.sumOfElements(myList));
    }
    @Test
    void testNullElements() {
        assertNull(sum.sumOfElements(myList));
    }
}