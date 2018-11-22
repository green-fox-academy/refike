package Fibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void testfibonacci() {
    int myFibNumber = 6;
    int expected = 8;

    assertEquals(expected, Fibonacci.fibonacci(myFibNumber));

    }
}