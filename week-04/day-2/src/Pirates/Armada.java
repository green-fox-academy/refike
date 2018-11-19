package Pirates;

import java.util.ArrayList;
import java.util.List;

public class Armada {
    public List<Ship> armada;

    public Armada() {
        this.armada = new ArrayList<>();
    }


    public void shipADD (Ship ship){
        armada.add(ship);
    }
    public void addSingleShip (Ship ship){
        armada.add(ship);
        ship.fillShip();
    }

    public void fillArmada () {
        int randomNumber = (int) (Math.random()* (3)+1);
        for (int i = 0; i <randomNumber ; i++) {
            Ship shipADD = new Ship();
            shipADD.fillShip();
            armada.add(shipADD);

        }
    }

    public int getSize() {
        return this.armada.size();
    }
    public Ship getShip(int a) {
        return this.armada.get(a);
    }

    public boolean armadaWar (Armada anOtherArmada) {
        while (getSize() != 0 && anOtherArmada.getSize() != 0) {
            if (getShip(0).battle(anOtherArmada.getShip(0))) {
                anOtherArmada.armada.remove(0);
            } else {
                armada.remove(0);
            }
        }
        return anOtherArmada.getSize() == 0;
    }
    @Override
    public String toString() {
        return "Armada{armadaSize: " + armada.size() +
                " armada=" + armada +
                '}';
    }
}
