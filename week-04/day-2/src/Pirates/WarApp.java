package Pirates;

public class WarApp {
    public static void main(String[] args) {
        Armada spanish = new Armada();
        spanish.fillArmada();
        Armada british = new Armada();
        british.fillArmada();

        System.out.println(spanish);
        System.out.println(british);
        System.out.println(spanish.getSize());
        System.out.println(british.getSize());

        System.out.println(spanish.armadaWar(british));
        System.out.println(spanish.getSize());
        System.out.println(british.getSize());
    }
}
