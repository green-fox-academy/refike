package Sharpie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SharpieTest {
    Sharpie mySharpie = new Sharpie("black",10.);

    @Test
    void use() {
        int expectedInkAmount = 99;
        assertEquals(expectedInkAmount,mySharpie.use());
    }

    @Test
    void useALL() {
        int expectedInkAmount = 0;
        assertEquals(expectedInkAmount,mySharpie.useALL());
    }
}