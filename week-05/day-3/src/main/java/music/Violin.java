package main.java.music;

public class Violin extends StringedInstrument {

    public Violin() {
        name = "Violin";
        numberOfStrings = 4;
        sound = "Screech";
    }

    @Override
    void sound() {
        System.out.println(name + " has " + numberOfStrings + " strings and " + sound + " sound.");
    }
}
