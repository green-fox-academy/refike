package Garden;

public class Main {
    public static void main(String[] args) {

        Plants yellow = new Flower("yellow");
        Plants blue = new Flower("blue");
        Plants purple = new Tree("purple");
        Plants orange = new Tree("orange");

        Garden myGarden = new Garden();
        myGarden.addPlants(yellow);
        myGarden.addPlants(blue);
        myGarden.addPlants(purple);
        myGarden.addPlants(orange);

        myGarden.status();
        myGarden.watering(40);

        myGarden.status();
        myGarden.watering(100);

        myGarden.status();

    }
}
