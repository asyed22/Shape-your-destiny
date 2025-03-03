package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RightTriangleTest {
    @Test
    void testRightTriangleArea() {
        RightTriangle rightTriangle = new RightTriangle(3, 4);
        assertEquals(6, rightTriangle.getArea());
    }

    @Test
    void testRightTrianglePerimeter() {
        RightTriangle rightTriangle = new RightTriangle(3, 4);
        assertEquals(12, rightTriangle.getPerimeter());
    }

    @Test
    void testRightTriangleSides() {
        RightTriangle rightTriangle = new RightTriangle(3, 4);
        assertEquals(3, rightTriangle.numberOfSides());
    }
}