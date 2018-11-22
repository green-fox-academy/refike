package main.java.music;

public class BassGuitar extends StringedInstrument {

    public BassGuitar() {
        name = "Bass Guitar";
        numberOfStrings = 4;
        sound = "Dum - Dum - Dum";
    }

    public BassGuitar(int number) {
        name = "Bass Guitar";
        numberOfStrings = number;
        sound = "Dum - Dum - Dum";
    }

    @Override
    void sound() {
        System.out.println(name + " has " + numberOfStrings + " strings and " + sound + " sound.");
    }
}
