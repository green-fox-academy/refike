package HeroBattle;

public class Hero extends BaseHero implements Punchable {

    double motivation;

    public Hero(String name, double motivation) {
        super(name);
        this.motivation = motivation;
    }

    public double getMotivation() {
        return motivation;
    }



    @Override
    public void punch(Punchable other) {

        if (this.getMotivation() >= 1) {
           double dmg = this.motivation / 1.5;
            other.bePunched(dmg);
        }
    }

    @Override
    public int getMotivationLevel() {
        if (this.motivation < 25) {
            return 0;
        } else if (this.motivation >= 25 && this.motivation < 40) {
            return 1;
        }
        return 2;
    }

    @Override
    public void bePunched(double damage) {
        this.motivation -= (damage / motivation);
;
    }

    @Override
    public String toString() {
        if (getMotivationLevel()== 0) {
            return getName() + " not motivated anymore";
        } else if (getMotivationLevel() == 1) {
            return getName() + " motivated";
        }
        return getName() + " well motivated";
    }
}
