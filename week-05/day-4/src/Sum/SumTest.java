package Sum;

import org.junit.jupiter.api.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {

    @Test
    void testSumOfElements() {
    Sum sum = new Sum(new ArrayList<>(Arrays.asList(2,3,4,5)));

    int expected = 14;
    assertEquals(expected,sum.sumOfElements());

    }
}