package PiratePractice;

public class Battle {
    public static void main(String[] args) {
        Ship blackPearl = new Ship();
        Ship titanic = new Ship();
        blackPearl.fillShip();
        titanic.fillShip();


        System.out.println("Black Pearl crew number " + blackPearl.counter());
        System.out.println("Titanic crew number " + titanic.counter());
       blackPearl.battleShip(titanic);
        System.out.println("Black Pearl crew number after battle " + blackPearl.counter());
        System.out.println("Titanic crew number after battle " + titanic.counter());

    }
}
