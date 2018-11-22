package CharSequence;

public class Gnirts implements CharSequence {
    String myString;

    public Gnirts(String myString) {
        this.myString = myString;
    }
    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return   myString.charAt(myString.length() -1 - index );
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }
}
