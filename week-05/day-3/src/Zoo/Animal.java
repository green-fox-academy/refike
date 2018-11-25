package Zoo;

public abstract class Animal {

    String name;
    int age;
    String gender;
    int numberOfLegs;
    boolean isMammal;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String breed();

    public abstract void eat();

    public abstract void move();
}
