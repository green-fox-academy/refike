package Counter;

public class main {
    public static void main(String[] args) {
        Counter myNumber = new Counter();
        myNumber.add();
        System.out.println(myNumber.counter);
        myNumber.add(10);
        System.out.println(myNumber.counter);
        Counter myNumber2 = new Counter(40);
        myNumber2.add(10);
        System.out.println(myNumber2.counter);
        myNumber2.reset();
        System.out.println(myNumber2.counter);
        myNumber.reset();
        System.out.println(myNumber.counter);

    }
}
