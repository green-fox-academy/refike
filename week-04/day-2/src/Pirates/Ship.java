package Pirates;

import java.util.ArrayList;
import java.util.List;

public class Ship {
    public List<Pirate> staff;


    public Ship() {
        this.staff = new ArrayList<>();
    }

    public void fillShip() {
        staff.add(new Pirate(true));
        staff.get(0).drinkSomeRum();

        int crewNumber = (int) (Math.random() * ((100-25) + 1)+25);
        for (int i = 0; i < crewNumber; i++) {
            staff.add(new Pirate(false));
        }
    }

    public int counter() {
        int counter = 0;
        for (int i = 0; i < staff.size(); i++) {
            if (staff.get(i).isAlive) {
                counter++;
            }
        }
        return counter;
    }

    public  void weWIN(Ship givenShip) {
        int randomDeaths = (int) (Math.random() * (givenShip.staff.size()) + 1);
        for (int i = 1; i < randomDeaths; i++) {
            givenShip.staff.get(i).die();
        }
        int randomPartyRums = (int) (Math.random() * (staff.size()) + 1);
        for (int i = 0; i < randomPartyRums; i++) {
            staff.get(i).drinkSomeRum();
        }
        System.out.println("My ship won");
    }

    public void enemyWIN (Ship anotherShip) {
        int randomDeaths = (int) (Math.random() * (staff.size()) + 1);
        for (int i = 1; i < randomDeaths; i++) {
            staff.get(i).die();
        }
        int randomPartyRums = (int) (Math.random() * (anotherShip.staff.size()) + 1);
        for (int i = 0; i < randomPartyRums; i++) {
            anotherShip.staff.get(i).drinkSomeRum();
        }
        System.out.println("The enemy ship won");
    }


    public boolean battle(Ship anotherShip) {
        int myShipScore = counter() - staff.get(0).intoxicateLvL;
        int otherShipScore = anotherShip.counter() - anotherShip.staff.get(0).intoxicateLvL;
        if (myShipScore > otherShipScore) {

            weWIN(anotherShip);
            return true;

        } else {
            enemyWIN(anotherShip);
            return false;
         }
    }
}


