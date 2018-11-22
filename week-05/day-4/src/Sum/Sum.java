package Sum;

import java.util.ArrayList;

public class Sum {

    ArrayList<Integer> myArray;

    public Sum(ArrayList<Integer> myArray) {
        this.myArray = myArray;
    }

    public int sumOfElements () {
        int summa = 0;
        for (int i = 0; i <myArray.size() ; i++) {
            summa += myArray.get(i);
        }

        return summa;
    }
}
