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

    public int counter(){
        int counter = 0;
        for (int i = 0; i <plants.size() ; i++) {
          if(plants.get(i).needWater()){
              counter++;
          }
        }
        return counter;
    }

    public void watering (int amountOfWater){
        int counter = counter();
        for (int i = 0; i <plants.size(); i++) {
            plants.get(i).water(amountOfWater/counter);
        }
    }

    public void status() {
        for (int i = 0; i < plants.size(); i++) {
            if (plants.get(i).needWater()) {
                System.out.println(plants.get(i).getColor() + " need water");
            } else {
                System.out.println(plants.get(i).getColor() + " doesn't need water");
            }
        }
    }
}
