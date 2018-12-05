package AirCraft;

import java.util.ArrayList;
import java.util.List;

public class Carrier {
    List<AirCraft> airCrafts;
    int carrierStore;
    int carrierHP;

    public Carrier() {
        this.airCrafts = new ArrayList<AirCraft>();
        this.carrierHP = 5000;
        this.carrierStore = 1000;
    }


    public void addPlane(AirCraft plane) {
        airCrafts.add(plane);
    }

    public int counter() {
        int ammoNeeded = 0;
        for (int i = 0; i < airCrafts.size(); i++) {
            ammoNeeded += airCrafts.get(i).ammoNeeded();
        }
        return ammoNeeded;
    }

    public void refill() throws Exception {
        if (carrierStore == 0) {
            new Exception("Not enaugh ammo in the Carrier Store");

        } else if (carrierStore > counter()) {
            for (int i = 0; i < airCrafts.size(); i++) {
                carrierStore = airCrafts.get(i).refill(carrierStore);
            }
        } else if (carrierStore < counter()) {
            for (int i = 0; i < airCrafts.size(); i++) {
                if (airCrafts.get(i).isPriority()) {
                    carrierStore = airCrafts.get(i).refill(carrierStore);
                }
            }
            for (int i = 0; i < airCrafts.size(); i++) {
                carrierStore = airCrafts.get(i).refill(carrierStore);
            }

        }


    }

    public void carrierFight (Carrier carrier) {
        int maxDMG = 0;
        for (int i = 0; i <airCrafts.size() ; i++) {
            maxDMG = airCrafts.get(i).fight();
            carrier.carrierHP -= maxDMG;
        }

    }


    public void status() {
        int totalDMG = 0;
        System.out.println("HP: " + carrierHP + ", Planes count: " + airCrafts.size()+ ", Ammo storage: " + carrierStore
                + ", Total dmg: " + totalDMG );
        for (int i = 0; i < airCrafts.size(); i++) {
            System.out.println(airCrafts.get(i).getStatus());
            totalDMG += airCrafts.get(i).maxDMG();
            // azért kel a sout mert csak returnölök egy Stringet ami az adot gép statusa
        }
    }
}