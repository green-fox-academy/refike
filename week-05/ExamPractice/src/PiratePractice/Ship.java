package PiratePractice;

import java.util.ArrayList;
import java.util.List;

public class Ship {
    List<Pirate> staff;

    public Ship() {
        this.staff = new ArrayList<>();
    }

    public void fillShip() {
        Pirate captain = new Pirate(true);
        int randomRum = (int) (Math.random() * (4) + 1);
        for (int i = 0; i < randomRum; i++) {
            captain.drinkSomeRum();
        }
        staff.add(captain);
        int randomNumPirates = (int) (Math.random() * ((50-20)+1)+20);
        for (int i = 0; i <randomNumPirates ; i++) {
            Pirate pirate = new Pirate(false);
            staff.add(pirate);
        }
    }


    public int counter () {
        int counter = 0;
        for (int i = 0; i <staff.size() ; i++) {
            if(staff.get(i).isAlive){
                counter++;
            }

        }
        return counter;
    }

    private void myShipWin (Ship otherShip) {
        int randomDeath = (int) (Math.random() * (otherShip.staff.size()+1));
        for (int i = 1; i <randomDeath ; i++) {
            otherShip.staff.get(i).die();
        }
        int randomRum = (int) (Math.random() * (staff.size()+1));

        for (int i = 0; i <randomRum; i++) {
            staff.get(i).drinkSomeRum();
        }
        System.out.println("My ship won the battle .. let's ***Party***");

    }
    private void enemyShipWon (Ship otherShip) {
        int randomDeath = (int) (Math.random() * (staff.size()+1));
        for (int i = 1; i <randomDeath ; i++) {
            staff.get(i).die();
        }
        int randomRum = (int) (Math.random() * (otherShip.staff.size()+1));
        for (int i = 0; i <randomRum ; i++) {
            otherShip.staff.get(i).drinkSomeRum();
        }
        System.out.println("Enemy ship won the battle .. :((");


    }


    public boolean battleShip (Ship otherShip) {
        int myShipScore = counter() - staff.get(0).intoxicateLvl;
        int enemyShipScore = otherShip.counter() - otherShip.staff.get(0).intoxicateLvl;
        if (myShipScore > enemyShipScore){
            myShipWin(otherShip);
            return true;
        } else {
            enemyShipWon(otherShip);
            return false;
        }
    }

}
