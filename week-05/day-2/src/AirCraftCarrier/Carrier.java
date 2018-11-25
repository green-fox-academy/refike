package AirCraftCarrier;

import java.util.ArrayList;

public class Carrier {
    private ArrayList<Planes> planes;
    private int ammoStore;
    private int healthPoint;

    public Carrier() {
        this.planes = new ArrayList<Planes>();
        this.ammoStore = 5000;
        this.healthPoint = 10000;
    }

    private int setMaxDMG() {
        int maxDMG=0;
        for (int i = 0; i < planes.size(); i++) {
            maxDMG += planes.get(i).maxDMG();
        }
        return maxDMG;
    }

    public void addPlane(Planes plane) {
        planes.add(plane);
    }

    private int counter() {
        int ammoCounter = 0;
        for (int i = 0; i < planes.size(); i++) {
            ammoCounter += planes.get(i).ammoNeeded();
        }
        return ammoCounter;
    }

    private void refill() {                             // segéd method a fill()-hez
        for (int i = 0; i < planes.size(); i++) {
            ammoStore = planes.get(i).refill(ammoStore);
        }
    }
    public void fill()throws Exception {
       if (ammoStore <= 0) {
           throw  new Exception("No ammo left sorry bro...");
       }
       if (ammoStore > counter()){
            refill();
       } else {
            for (int i = 0; i < planes.size(); i++) {
                if (planes.get(i).isPriority()) {
                    ammoStore = planes.get(i).refill(ammoStore);
                }
            }
            refill();
        }
    }

    public void fight (Carrier carrier) {
        int totalDMG = 0;
        for (int i = 0; i <planes.size() ; i++) {
            totalDMG = planes.get(i).fight();
            carrier.healthPoint -= totalDMG;
        }
    }

    public void status() {
        System.out.println("HP: " + healthPoint + ", Planes count: " + planes.size()+ ", Ammo storage: " + ammoStore
                + ", Total dmg: " + setMaxDMG());
        for (int i = 0; i < planes.size(); i++) {
            System.out.println(planes.get(i).getStatus()); // azért kel a sout mert csak returnölök egy Stringet ami az adot gép statusa
        }
    }
}