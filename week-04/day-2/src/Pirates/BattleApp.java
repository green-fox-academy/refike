package Pirates;

public class BattleApp {
    public static void main(String[] args) {
        Ship blackPearl = new Ship();
        Ship flyingDutchman = new Ship();
        blackPearl.fillShip();
        flyingDutchman.fillShip();


        //  ship.staff.get(0).brawl(ship.staff.get(1));
       // ship.staff.get(0).drinkSomeRum();
       // ship.staff.get(0).drinkSomeRum();
       // ship.staff.get(0).drinkSomeRum();

        // ship.staff.get(0).howItsGoingMate();
        // ship.staff.get(0).die();
        // ship.staff.get(0).drinkSomeRum();


        System.out.println("My captain rum LVL " + blackPearl.staff.get(0).captainRumLvl());
        System.out.println("How many people my ship has " + blackPearl.counter());
        System.out.println("Enemy captain rum LVL " + flyingDutchman.staff.get(0).captainRumLvl());
        System.out.println("How many people the enemy ship has " + flyingDutchman.counter());
        blackPearl.battle(flyingDutchman);
        System.out.println("How many people left on my ship, after the battle " + blackPearl.counter());
        System.out.println("How many people left on the enemy ship, after the battle " + flyingDutchman.counter());


    }
}
