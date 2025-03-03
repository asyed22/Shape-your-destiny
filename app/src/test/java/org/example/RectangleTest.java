package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    void testRectangleArea() {
        Rectangle rectangle = new Rectangle(4, 6);
        assertEquals(24, rectangle.getArea());
    }

    @Test
    void testRectanglePerimeter() {
        Rectangle rectangle = new Rectangle(4, 6);
        assertEquals(20, rectangle.getPerimeter());
    }

    @Test
    void testRectangleSides() {
        Rectangle rectangle = new Rectangle(4, 6);
        assertEquals(4, rectangle.numberOfSides());
    }
}