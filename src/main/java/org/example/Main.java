package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("===== Circle Test =====");
        Circle c = new Circle(12);

        System.out.println("Circle radius: " + c.getRadius());
        c.setRadius(15);
        System.out.println("Circle radius after using Mutator: " + c.getRadius());
        System.out.println();
        System.out.printf("The Area of Circle Object = %.2f \n", c.calculateArea());
        System.out.printf("The Circumference of Circle Object = %.2f \n", c.calculateCircumference());

        System.out.println();

        System.out.println("===== Rectangle Test =====");
        Rectangle rec = new Rectangle(10, 15);
        System.out.println("Rectangle height: " + rec.getHeight());
        System.out.println("Rectangle width: " + rec.getWidth());
        rec.setHeight(7);
        rec.setWidth(9);
        System.out.println("Rectangle height after using Mutator: " + rec.getHeight());
        System.out.println("Rectangle width after using Mutator: " + rec.getWidth());
        System.out.println();
        System.out.printf("The Area of Rectangle Object = %.2f \n", rec.calculateArea());
        System.out.printf("The Perimeter of Rectangle Object = %.2f \n", rec.calculateCircumference());

        System.out.println();

        System.out.println("===== Triangle Test =====");
        Triangle tri = new Triangle(5, 6);
        System.out.println("Triangle height: " + tri.getHeight());
        System.out.println("Triangle base: " + tri.getBase());
        tri.setHeight(8);
        tri.setBase(10);
        System.out.println("Triangle height after using Mutator: " + tri.getHeight());
        System.out.println("Triangle width after using Mutator: " + tri.getBase());
        System.out.println();
        System.out.printf("The Area of Triangle Object = %.2f \n", tri.calculateArea());
        System.out.printf("The Perimeter of Triangle Object = %.2f \n", tri.calculateCircumference());

    }
}