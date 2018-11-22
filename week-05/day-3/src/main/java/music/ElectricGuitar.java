package main.java.music;

public class ElectricGuitar extends StringedInstrument {

    public ElectricGuitar() {
        name = "Electric Guitar";
        numberOfStrings = 6;
        sound = "Twang";
    }

    public ElectricGuitar(int number) {
        name = "Electric Guitar";
        numberOfStrings = number;
        sound = "Twang";
    }

    @Override
    void sound() {
        System.out.println(name + " has " + numberOfStrings + " strings, and " + sound + " sound.");
    }
}
