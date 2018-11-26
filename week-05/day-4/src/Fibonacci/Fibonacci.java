package Fibonacci;

public class Fibonacci {

    public static int fibonacci (int f) {
        if (f <= 0) {
            return 0;
        } else  if (f ==1) {
            return 1;
        } else {
            return fibonacci(f-1) + fibonacci(f-2);
        }
    }

}
