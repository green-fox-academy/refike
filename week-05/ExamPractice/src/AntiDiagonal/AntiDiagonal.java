package AntiDiagonal;

public class AntiDiagonal {

    /**
     * Create and test a method called `getAntiDiagonalAvg` that takes a multidimensional array (only integers)
     * which represents a square matrix, as a parameter and returns the average of the numbers in the anti diagonal.
     * - write test for 2 different scenarios
     * <p>
     * Example cases:
     * [
     * [1, 2, 3],
     * [3, 4, 6],
     * [5, 2, 5]
     * ]
     * Should return 4, because (3 + 4 + 5) / 3 = 4.
     * <p>
     * [
     * [3, 5, 11, -2],
     * [3, 1, 7, 4],
     * [5, 0, 2, 9],
     * [21, 7, 8, 2]
     * ]
     * Should return 6.5, because (-2 + 7 + 0 + 21) / 4 = 6.5.
     */
    public static void main(String[] args) {

        int[][] multiArray = new int[][]{
                {3, 5, 11, -2},
                {3, 1, 7, 4},
                {5, 0, 2, 9},
                {21, 7, 8, 2}};

    }

    public  static  double getAntiDiagonalAvg(int[][] multiArray) {
        double sum = 0.;
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray.length; j++) {
                if (multiArray.length - 1 - i == j) {
                    sum = sum + (double) multiArray[i][j];
                }
            }
        }
        return sum / (double) multiArray.length;
    }
}
