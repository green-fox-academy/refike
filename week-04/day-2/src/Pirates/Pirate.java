package Pirates;

public class Pirate {
    int intoxicateLvL;
    boolean isAlive;
    boolean isCaptain;


    public Pirate (boolean isCaptain){
        this.isCaptain = isCaptain;
        this.intoxicateLvL = 0;
        this.isAlive = true;
    }

    public int captainRumLvl () {
        if (isAlive) {
            if (isCaptain) {
                if (intoxicateLvL >= 5) {
                    System.out.println("Captain is dead");
                }

            }

        }
        return intoxicateLvL;
    }

    public void drinkSomeRum() {
        if (isAlive) {
            int randomRum = (int)(Math.random()*((5-1)+1)+1);
            intoxicateLvL = randomRum;
        }
        else {
            System.out.println("He is dead");
        }
    }



    public void howItsGoingMate () {
        if (isAlive) {
            if (intoxicateLvL >= 0 && intoxicateLvL < 5) {
                System.out.println("Pour me anudder!");

            } else {
                System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
                die();

            }
        } else {
            System.out.println("He is dead");
        }
    }


    public void die() {
        isAlive = false;
    }

    public void brawl (Pirate anOtherPirate) {
        if (isAlive && anOtherPirate.isAlive) {
            int number = (int) (Math.random() * (3) + 1);
            if (number == 1) {
                die();
                System.out.println("My pirate died ");
            }
            else if (number == 2) {
                anOtherPirate.die();
                System.out.println("My pirate was better, and the other one is dead, HAHAHAHA");
            } else {
                die();
                anOtherPirate.die();
                System.out.println("Both dead");
            }
        } else {
            System.out.println("One or even both are dead");

        }
    }
}
