package org.example;

public class App {
  public static void main(String[] args) {
      Circle circle = new Circle(5);
      Rectangle rectangle = new Rectangle(4, 6);
      Square square = new Square(4);
      RightTriangle rightTriangle = new RightTriangle(3, 4);
      IsoscelesRightTriangle isoscelesRightTriangle = new IsoscelesRightTriangle(5);

      System.out.println("Circle Area: " + circle.getArea());
      System.out.println("Circle Perimeter: " + circle.getPerimeter());

      System.out.println("Rectangle Area: " + rectangle.getArea());
      System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());

      System.out.println("Square Area: " + square.getArea());
      System.out.println("Square Perimeter: " + square.getPerimeter());

      System.out.println("Right Triangle Area: " + rightTriangle.getArea());
      System.out.println("Right Triangle Perimeter: " + rightTriangle.getPerimeter());

      System.out.println("Isosceles Right Triangle Area: " + isoscelesRightTriangle.getArea());
      System.out.println("Isosceles Right Triangle Perimeter: " + isoscelesRightTriangle.getPerimeter());

      System.out.println("Rectangle Sides: " + rectangle.numberOfSides());
      System.out.println("Square Sides: " + square.numberOfSides());
      System.out.println("Right Triangle Sides: " + rightTriangle.numberOfSides());
      System.out.println("Isosceles Right Triangle Sides: " + isoscelesRightTriangle.numberOfSides());
  }
}