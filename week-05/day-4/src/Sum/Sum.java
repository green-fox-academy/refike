package Sum;

import java.util.ArrayList;

public class Sum {

    ArrayList<Integer> myArray;


    public int sumOfElements (ArrayList<Integer> mylist) {
        int summa = 0;
        for (int i = 0; i <mylist.size() ; i++) {
            summa += mylist.get(i);
        }

        return summa;
    }
}
