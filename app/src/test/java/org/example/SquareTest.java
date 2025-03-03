package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    @Test
    void testSquareArea() {
        Square square = new Square(4);
        assertEquals(16, square.getArea());
    }

    @Test
    void testSquarePerimeter() {
        Square square = new Square(4);
        assertEquals(16, square.getPerimeter());
    }

    @Test
    void testSquareSides() {
        Square square = new Square(4);
        assertEquals(4, square.numberOfSides());
    }
}