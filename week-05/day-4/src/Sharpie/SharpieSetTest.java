package Sharpie;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SharpieSetTest {
    Sharpie blue = new Sharpie("blue",10.);
    Sharpie red = new Sharpie("red",12.);
    SharpieSet mySharpies = new SharpieSet();

    @BeforeEach
    void setUp() {
    }

    @Test
    void add() {
    }

    @Test
    void countUsable() {
        mySharpies.add(blue);
        mySharpies.add(red);
        int expected = 2;
        assertEquals(expected,mySharpies.countUsable());
    }

    @Test
    void remove() {
    }
}