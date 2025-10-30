package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("===== Circle Test =====");
        Circle c1 = new Circle(15);
        Circle c2 = new Circle(10);
        Circle c3 = new Circle(20);

        System.out.println("Circle c2 radius: " + c2.getRadius());
        c3.setRadius(12);
        System.out.println("Circle c3 radius after using Mutator: " + c3.getRadius());
        System.out.println();
        System.out.printf("The Area of Circle c1 Object = %.2f \n", c1.calculateArea());
        System.out.printf("The Circumference of Circle c1 Object = %.2f \n", c1.calculateCircumference());

        System.out.println();

        System.out.println("===== Rectangle Test =====");
        Rectangle rec1 = new Rectangle(7, 9);
        Rectangle rec2 = new Rectangle(10, 15);
        Rectangle rec3 = new Rectangle(8, 5);

        System.out.println("Rectangle rec2 height: " + rec2.getHeight());
        System.out.println("Rectangle rec2 width: " + rec2.getWidth());
        rec3.setHeight(12);
        rec3.setWidth(6);
        System.out.println("Rectangle rec3 height after using Mutator: " + rec3.getHeight());
        System.out.println("Rectangle rec3 width after using Mutator: " + rec3.getWidth());
        System.out.println();
        System.out.printf("The Area of Rectangle rec1 Object = %.2f \n", rec1.calculateArea());
        System.out.printf("The Perimeter of Rectangle rec1 Object = %.2f \n", rec1.calculateCircumference());

        System.out.println();

        System.out.println("===== Triangle Test =====");
        Triangle tri1 = new Triangle(8, 10);
        Triangle tri2 = new Triangle(5, 6);
        Triangle tri3 = new Triangle(8, 9);

        System.out.println("Triangle tri2 height: " + tri2.getHeight());
        System.out.println("Triangle tri2 base: " + tri2.getBase());
        tri3.setHeight(10);
        tri3.setBase(12);
        System.out.println("Triangle tri3 height after using Mutator: " + tri3.getHeight());
        System.out.println("Triangle tri3 width after using Mutator: " + tri3.getBase());
        System.out.println();
        System.out.printf("The Area of Triangle tri1 Object = %.2f \n", tri1.calculateArea());
        System.out.printf("The Perimeter of Triangle tri1 Object = %.2f \n", tri1.calculateCircumference());

    }
}