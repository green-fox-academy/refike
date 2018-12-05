package AirCraft;

public class Main {
    public static void main(String[] args) throws Exception {
        AirCraft first = new F16("F16");
        AirCraft second = new F16("F16");
        AirCraft third = new F35("F35");
        AirCraft forth = new F35("F35");

        Carrier firstCarrier = new Carrier();
        firstCarrier.addPlane(first);
        firstCarrier.addPlane(second);
        firstCarrier.addPlane(third);
        firstCarrier.addPlane(forth);

        firstCarrier.refill();
        firstCarrier.status();

        AirCraft one = new F16("F16");
        AirCraft two = new F16("F16");
        AirCraft three = new F35("F35");
        AirCraft four = new F35("F35");
        Carrier secondCarrier = new Carrier();
        secondCarrier.addPlane(one);
        secondCarrier.addPlane(two);
        secondCarrier.addPlane(three);
        secondCarrier.addPlane(four);
        secondCarrier.refill();
        secondCarrier.status();

        firstCarrier.carrierFight(secondCarrier);
        firstCarrier.status();
        secondCarrier.status();


    }
}
