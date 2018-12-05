package PiratePractice;

public class warApp {
    public static void main(String[] args) {
        Armada english = new Armada();
        english.fillArmada();
        Armada spanish = new Armada();
        spanish.fillArmada();
        System.out.println(english.getSize());
        System.out.println(spanish.getSize());

        english.armadaWar(spanish);
        System.out.println(english.getSize());
        System.out.println(spanish.getSize());

    }
}
