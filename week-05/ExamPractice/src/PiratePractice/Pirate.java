package PiratePractice;

public class Pirate {
    int intoxicateLvl;
    boolean isCaptain;
    boolean isAlive;


    public Pirate(boolean isCaptain) {
        this.intoxicateLvl = 0;
        this.isCaptain = isCaptain;
        this.isAlive = true;
    }

    public void drinkSomeRum() {
        this.intoxicateLvl++;
    }

    public void howItsGoingMate() {
        if (isAlive) {
            if (intoxicateLvl >= 0 && intoxicateLvl < 5){
                System.out.println("Pour me anudder!4!..");
            } else if (intoxicateLvl >= 5){
                System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin??");
                die();
            }
        } else {
            System.out.println("The pirate was dead, can't drink");
        }
    }

    public void die() {
         this.isAlive = false;
    }

    public void brawl(Pirate enemy) {
        if (this.isAlive && enemy.isAlive) {
            int randomNum = (int) (Math.random() * (3) + 1);
            if(randomNum ==1){
                System.out.println("My pirate died in the brawl");
                die();
            } else if(randomNum ==2){
                System.out.println("The enemy Pirate died in brawl, my pirate WIN");
                enemy.die();
            } else {
                System.out.println("Both died in the brawl, lol");
                die();
                enemy.die();
            }
        } else {
            System.out.println("Cant brawl, on of them are dead");
        }
    }

    public int getIntoxicateLvl() {
        if (isCaptain){
            System.out.println("Captain rum level");
            return intoxicateLvl;
        } else
        return intoxicateLvl;
    }
}
