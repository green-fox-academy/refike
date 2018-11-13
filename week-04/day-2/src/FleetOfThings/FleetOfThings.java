package FleetOfThings;

public class FleetOfThings {

    public static void main(String[] args) {
        Fleet fleet = new Fleet();
        Thing myThing = new Thing("Get Milk");
        Thing myThing1 = new Thing("Remove the obstacles");
        Thing myThing2 = new Thing("Stand up");
        Thing myThing3 = new Thing("Eat Lunch");
        myThing2.complete();
        myThing3.complete();
        fleet.add(myThing);
        fleet.add(myThing1);
        fleet.add(myThing2);
        fleet.add(myThing3);
        // Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch

        System.out.println(fleet);
    }
}