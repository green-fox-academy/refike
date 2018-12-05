package PiratePractice;

import java.util.ArrayList;
import java.util.List;

public class Armada {
    List<Ship> ships;

    public Armada() {
        this.ships = new ArrayList<>();
    }

    public void fillArmada (){
        for (int i = 0; i <3 ; i++) {
            Ship ship = new Ship();
            ship.fillShip();
            ships.add(ship);
        }
    }

    public Ship getShip(int a) {
        return this.ships.get(a);
    }
    public int getSize() {
        return this.ships.size();
    }

    public boolean armadaWar (Armada enemy) {
        while (getSize() !=0 && enemy.getSize() != 0) {
        if (getShip(0).battleShip(enemy.getShip(0))){
            enemy.ships.remove(0);
        } else {
            ships.remove(0);
        }
    }

        return enemy.getSize() == 0;
    }



    @Override
    public String toString() {
        return "Armada{armadaSize: " + ships.size() +
                " armada=" + ships +
                '}';
    }
}