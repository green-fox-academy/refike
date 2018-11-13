package Counter;

public class Counter {
    int counter;
    int counter2;

    public Counter() {
        this.counter = 0;
        this.counter2 =0;
    }

    public Counter(int counter) {
        this.counter = counter;
        this.counter2 = counter;
    }

    public void add (int number) {
        counter+=number;
    }

    public void add(){
        counter++;
    }

    public void reset (){
        this.counter = counter2;
    }

    public int get() {
        return counter;
    }
}
