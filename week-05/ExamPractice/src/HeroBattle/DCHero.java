package HeroBattle;

public class DCHero extends Hero {
    public DCHero(String name) {
        super(name, 45);
    }

    public DCHero(String name, double motivation) {
        super(name, motivation);
    }

    @Override
    public void punch(Punchable other) {
        if (!(other instanceof DCHero)) {
            super.punch(other);
        }
    }
}
