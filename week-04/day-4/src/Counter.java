public class Counter {
    public static void main(String[] args) {
        // Write a recursive function that takes one parameter: n and counts down from n.

        CountDown(6);
    }

    public static void CountDown(int n) {
        if (n == 0) {
            System.out.println(n);

        } else {
            System.out.println(n);
            CountDown(n-1);
        }
    }
}



