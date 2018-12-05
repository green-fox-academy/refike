package AntiDiagonal;

import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class AntiDiagonalTest {
AntiDiagonal antiDiagonal = new AntiDiagonal();

    @Test
    public void TestGetAntiDiagonalAvg() {

        int[][] myArray = new int[][] {
                {3, 5, 11, -2},
                {3, 1, 7, 4},
                {5, 0, 2, 9},
                {21, 7, 8, 2}};

            assertEquals(6.5, antiDiagonal.getAntiDiagonalAvg(myArray));
        }
    }

