import java.util.ArrayList;
import java.util.Arrays;

public class unique2 {
    public static void main(String[] args) {

        ArrayList<Integer> mylist = new ArrayList<>(Arrays.asList(8, 1, 10, 8, 0, 1, 11, 8, 1, 22, 8, 61, 8, 0));
        System.out.println(unique(mylist));
    }

    public static ArrayList<Integer> unique(ArrayList<Integer> mynums) {
        for (int i = 0; i < mynums.size(); i++) {

            for (int j = i + 1; j < mynums.size(); j++) {
                if (mynums.get(i).equals(mynums.get(j))) {
                    mynums.remove(j);
                }
            }
        }
        return mynums;

    }
}