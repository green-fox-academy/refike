package main.java.music;

public abstract class StringedInstrument extends Instrument {

    protected int numberOfStrings;

    public StringedInstrument(String name, int numberOfStrings) {
        super(name);
        this.numberOfStrings = numberOfStrings;
    }

    abstract String sound();

    public void play() {
        System.out.println(name + ", a " + numberOfStrings + "-stringed instrument, with " + sound() + " sound.");
    }
}
