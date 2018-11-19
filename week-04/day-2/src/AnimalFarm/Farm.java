package AnimalFarm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Farm {
    private ArrayList<Animal> myAnimals;
    int counter;

    public Farm() {
        myAnimals = new ArrayList<>();
        counter = 0;
    }

    public void breed(Animal animal) {
        if (counter < 10)
            myAnimals.add(animal);
        counter++;
    }

    public void slaughter() {
        myAnimals.remove(minAnimal());
        System.out.println(myAnimals);
    }

    public Animal minAnimal() {
        int min = 0;
        Animal minAnimal = myAnimals.get(0);
        for (int i = 0; i < myAnimals.size(); i++) {
            if (myAnimals.get(i).hunger < myAnimals.get(min).hunger) {
                min = myAnimals.get(i).hunger;
                minAnimal = myAnimals.get(i);
            }
        }

        return minAnimal;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "myAnimals=" + myAnimals +
                '}';
    }
}
