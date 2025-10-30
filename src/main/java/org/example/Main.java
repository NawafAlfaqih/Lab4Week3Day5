package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) { startTest(); }
    }

    private static void startTest() {
        System.out.println("===== Welcome to Shapes Program's test CLI =====");
        System.out.println();
        System.out.println("1. Show Circle Class test.");
        System.out.println("2. Show Rectangle Class test.");
        System.out.println("3. Show Triangle Class test.");

        int choice = readIntInRange(0, 3, "Choose a number to Start the test, or (0) to exit -> ");
        switch (choice) {

            case 1:
                circleTest();
                break;

            case 2:
                rectangleTest();
                break;

            case 3:
                triangleTest();
                break;

            case 0:
                System.exit(0);
                break;

            default:
                System.out.println("Not a Valid Number....");
                System.out.println();
                startTest();
        }
    }

    private static void triangleTest() {
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

        System.out.println();
    }

    private static void rectangleTest() {
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
    }

    private static void circleTest() {
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
    }

    private static int readIntInRange(int from, int to, String message) throws IllegalArgumentException{
        Scanner input = new Scanner(System.in);

        try {
            if(from > to)
                throw new IllegalArgumentException("Invalid Range argument for reading int!!!");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            startTest(); //restart game
        }

        boolean valid = false;
        int number = 0;
        do {
            try {
                System.out.print(message);
                number = input.nextInt();
                if(number < from || number > to)
                    throw new ArithmeticException("Number is not in range ("+from+"-"+to+"), try again.");
                valid = true;
            }
            catch (InputMismatchException e) {
                System.out.println("Not a number, try again.");
                input.next();
            }
            catch (ArithmeticException e){
                System.out.println(e.getMessage());
            }
        } while (!valid);

        return number;
    }
}