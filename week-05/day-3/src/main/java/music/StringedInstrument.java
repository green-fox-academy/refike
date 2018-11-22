package main.java.music;

public abstract class StringedInstrument extends Instrument{

    protected int numberOfStrings;
    protected String sound;

    abstract void sound();

    @Override
    void play() {
        sound();
    }
}
