package AirCraftCarrier;

public class Main {
    public static void main(String[] args) {



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

        Carrier mySecondCarrier = new Carrier();
        mySecondCarrier.addPlane(first);
        mySecondCarrier.addPlane(second);
        mySecondCarrier.addPlane(third);
        mySecondCarrier.addPlane(fourth);
        mySecondCarrier.fill();
        myCarrier.status();


        myCarrier.fight(mySecondCarrier);
        myCarrier.status();
        mySecondCarrier.status();



      //  myCarrier.status();
//        first.fight();
//        myCarrier.status();


    }
}
