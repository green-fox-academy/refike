package Garden;

import java.util.ArrayList;

public class Garden {
    private ArrayList<Plants> plants;

    public Garden() {
        this.plants = new ArrayList<Plants>();
    }

    public void addPlants (Plants plant) {
        plants.add(plant);
    }

    private int counter(){
        int counter = 0;
        for (Plants plant : plants) {
            if (plant.needWater()) {
                counter++;
            }
        }
        return counter;
    }

    public void watering(int amountOfWater){
        int counter = counter();
        for (Plants plant : plants) {
            plant.water(amountOfWater / counter);
        }
    }

    public void status() {
        for (Plants plant : plants) {
            if (plant.needWater()) {
                System.out.println(plant.getColor() + " needs water");
            } else {
                System.out.println(plant.getColor() + " doesn't need water");
            }
        }
    }
}
