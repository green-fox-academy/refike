package TrickyAverage;

public class TrickyAverage {
    /**
     * Create and test a function called `getTrickyAvg` that takes a number array (only integers) as parameter
     * and returns the average of the smallest odd and largest even.
     * - use only basic control flow statements, like 'for', 'if', etc.
     * - do not use built-in methods like 'filter', 'forEach', 'map', etc.
     * - write test for 2 different scenarios (test file is provided: TrickyAverageTest.java)
     * <p>
     * Example cases:
     * [1, 2, 3] -> should return 1.5
     * [3, 4, 5, 6] -> should return 4.5
     * [5, 2, 8, -1] -> should return 3.5
     */

    public static void main(String[] args) {
        int[] name = {1,2,33,4,5,8,55,0,4,0,9};
        System.out.println(getTrickyAvg(name));
    }

    public static double getTrickAvg2(int[] intArray) {
        int smallOdd = 0;
        int maxEven = 0;
        for (int i = 1; i < intArray.length; i++) {
            if (intArray[i] % 2 != 0) {
                if (intArray[i] <= intArray[smallOdd] ) {
                    smallOdd = intArray[i];
                    System.out.println(smallOdd);
                }
            } else if (intArray[i] % 2 == 0) {
                if (intArray[i] > intArray[maxEven]) {
                    maxEven = i;
                    System.out.println(maxEven);

                }
            }

        }
        return (double)(smallOdd+maxEven)/2;
    }


        public static double getTrickyAvg(int[] numbers) {
            int largestEven = 0;
            int smallestOdd = 0;

            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 == 0 && numbers[i] > largestEven) {
                    largestEven = numbers[i];
                }

                if (numbers[i] % 2 != 0 && numbers[i] < smallestOdd) {
                    smallestOdd = numbers[i];
                }
            }
            System.out.println(largestEven);
            System.out.println(smallestOdd);
            return (largestEven+smallestOdd)/2;
        }
    }


