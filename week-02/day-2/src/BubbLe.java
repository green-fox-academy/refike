import java.util.ArrayList;
import java.util.Arrays;

public class BubbLe {
    public static void main(String[] args) {
        //  Create a function that takes a list of numbers as parameter
        //  Returns a list where the elements are sorted in ascending numerical order
        //  Make a second boolean parameter, if it's `true` sort that list descending

        //  Example:
        System.out.println(bubble(new int[]{34, 12, 24, 9, 5}));
        //  should print [5, 9, 12, 24, 34]
        System.out.println(advancedBubble(new int[]{34, 12, 24, 9, 5}, false));
        //  should print [34, 24, 12, 9, 5]
    }

    public static String bubble(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int flag = array[i];
                    array[i] = array[j];
                    array[j] = flag;
                }

            }

        }
        String sorted = Arrays.toString(array);
        return sorted;
    }

    public static String advancedBubble(int[] secondArray, Boolean b) {
        if (b) {
            for (int i = 0; i < secondArray.length - 1; i++) {
                for (int j = i + 1; j < secondArray.length; j++) {
                    if (secondArray[i] < secondArray[j]) {
                        int flag = secondArray[i];
                        secondArray[i] = secondArray[j];
                        secondArray[j] = flag;
                    }

                }

            }
            String sorted = Arrays.toString(secondArray);
            return sorted;
        }
           return "Boolean = false";
        }


}
