package HeroBattle;

public class MarvelHero extends Hero {

    public MarvelHero(String name) {
        super(name, 40);
    }

    public MarvelHero(String name, double motivation) {
        super(name, motivation);
    }

    @Override
    public void punch(Punchable other) {
        if (!(other instanceof MarvelHero))
            super.punch(other);
    }
}
