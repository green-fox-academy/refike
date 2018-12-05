package FleetOfThings;

import java.util.ArrayList;
import java.util.List;

public class Fleet {
    List<Thing> things;

    public Fleet() {
        this.things = new ArrayList<>();

    }

    public void add(Thing thing) {
        things.add(thing);
    }


    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < things.size(); i++) {
            result += (i + 1) + ". " + things.get(i) + "\n";
        }
        return result;
    }
}
