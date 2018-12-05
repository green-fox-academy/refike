package FleetOfThings;

public class FleetOfThings {
    public static void main(String[] args) {


        Thing thing = new Thing("Walk the dog");
        Thing thing2 = new Thing("Eat food");
        Thing thing3 = new Thing("Take a shower");
        Thing thing4 = new Thing("Do the shopping");

        thing.isCompleted();
        thing2.isCompleted();

        Fleet myFleet = new Fleet();
        myFleet.add(thing);
        myFleet.add(thing2);
        myFleet.add(thing3);
        myFleet.add(thing4);

        System.out.println(myFleet);
    }
}
