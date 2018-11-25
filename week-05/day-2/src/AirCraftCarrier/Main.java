package AirCraftCarrier;

public class Main {
    public static void main(String[] args) throws Exception {

        // first carrier
        Planes first = new F16("F16");
        Planes second = new F16("F16");
        Planes third = new F35("F35");
        Planes fourth = new F35("F35");

        Carrier myCarrier = new Carrier();
        myCarrier.addPlane(first);
        myCarrier.addPlane(second);
        myCarrier.addPlane(third);
        myCarrier.addPlane(fourth);

        myCarrier.fill();
        myCarrier.status();

        Planes one = new F16("F16");
        Planes two = new F16("F16");
        Planes three = new F35("F35");
        Planes four = new F35("F35");

        // second carrier
        Carrier mySecondCarrier = new Carrier();
        mySecondCarrier.addPlane(one);
        mySecondCarrier.addPlane(two);
        mySecondCarrier.addPlane(three);
        mySecondCarrier.addPlane(four);

        mySecondCarrier.fill();
        mySecondCarrier.status();


        myCarrier.fight(mySecondCarrier);
        myCarrier.status();
        mySecondCarrier.status();

    }
}
