package AnimalFarm;

public class Animal {
    int hunger;
    int thirst;
    String name;

    public Animal(String name) {
        this.name = name;
        this.hunger = 50;
        this.thirst = 50;
    }

    public void eat() {
        hunger--;
    }


    public void drink() {
        thirst--;
    }

    public void play() {
        hunger++;
        thirst++;

    }

    @Override
    public String toString() {
        return "Animal{" +
                "hunger=" + hunger +
                ", thirst=" + thirst +
                ", name='" + name + '\'' +
                '}';
    }
}


