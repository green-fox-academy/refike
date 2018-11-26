package Sum;

import java.util.ArrayList;

public class Sum {

    ArrayList<Integer> myArray;

    public Integer sumOfElements(ArrayList<Integer> myList) {
        Integer summa = 0;
        if (myList.isEmpty()){
            return null;
        } else {
            for (int i = 0; i < myList.size(); i++) {
                summa += myList.get(i);
            }
            return summa;
        }
    }
}
