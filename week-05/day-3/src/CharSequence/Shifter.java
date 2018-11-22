package CharSequence;

public class Shifter implements CharSequence {
    String myString;
    int number;

    public Shifter(String myString, int number) {
        this.myString = myString;
        this.number = number;
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return myString.charAt(index+number);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }
}
