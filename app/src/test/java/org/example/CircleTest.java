package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    @Test
    void testCircleArea() {
        Circle circle = new Circle(5); // Corrected syntax
        assertEquals(78.53981633974483, circle.getArea(), 0.0001); // Corrected syntax
    }

    @Test
    void testCirclePerimeter() {
        Circle circle = new Circle(5); // Corrected syntax
        assertEquals(31.41592653589793, circle.getPerimeter(), 0.0001); // Corrected syntax
    }
}