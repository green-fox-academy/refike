package Zoo;

public class Bird extends Animal {

    public Bird(String name) {
        super(name);
    }

    public String fly() {
        return "flying around";
    }

    @Override
    public String breed() {
        return "Laying eggs..";
    }

    @Override
    public void eat() {

    }

    @Override
    public void move() {
         fly();
    }
}
