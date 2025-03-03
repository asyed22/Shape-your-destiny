package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IsoscelesRightTriangleTest {
    @Test
    void testIsoscelesRightTriangleArea() {
        IsoscelesRightTriangle triangle = new IsoscelesRightTriangle(5);
        assertEquals(12.5, triangle.getArea());
    }

    @Test
    void testIsoscelesRightTrianglePerimeter() {
        IsoscelesRightTriangle triangle = new IsoscelesRightTriangle(5);
        assertEquals(17.071067811865476, triangle.getPerimeter(), 0.0001);
    }

    @Test
    void testIsoscelesRightTriangleSides() {
        IsoscelesRightTriangle triangle = new IsoscelesRightTriangle(5);
        assertEquals(3, triangle.numberOfSides());
    }
}