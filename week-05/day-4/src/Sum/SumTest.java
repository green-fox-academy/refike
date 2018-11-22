package Sum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {

    ArrayList<Integer> myList;
    Sum sum = new Sum();

    @BeforeEach
    void setUP () {
     myList = new ArrayList<Integer>();
    }

    @Test
    void testSumOfElements() {

    myList.add(1);
    myList.add(2);
    myList.add(3);
    myList.add(4);
    myList.add(5);

    int expected = 15;
    assertEquals(expected,sum.sumOfElements(myList));

    }
}