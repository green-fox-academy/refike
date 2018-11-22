package Sum;

import java.util.ArrayList;

public class Sum {

    ArrayList<Integer> myArray;


    public Integer sumOfElements(ArrayList<Integer> mylist) {
        Integer summa = 0;
        if (mylist.isEmpty()) {
            return null;
        } else {

            for (int i = 0; i < mylist.size(); i++) {
                summa += mylist.get(i);
            }

            return summa;
        }
    }
}
