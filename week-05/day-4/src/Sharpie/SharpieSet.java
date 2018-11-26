package Sharpie;

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
    List<Sharpie> mySHarpies;

    public SharpieSet() {
        this.mySHarpies = new ArrayList<>();

    }

    public void add (Sharpie sharpie) {
        mySHarpies.add(sharpie);
    }

    public int countUsable () {
        int counter = 0;
        for (int i = 0; i < mySHarpies.size(); i++) {
            if (mySHarpies.get(i).inkAmount >0) {
                counter++;
            }
        }
        return counter;
    }

    public void remove () {
        for (int i = 0; i <mySHarpies.size() ; i++) {
            if (mySHarpies.get(i).inkAmount <= 0){
                mySHarpies.remove(i);
            }

        }
    }
}
