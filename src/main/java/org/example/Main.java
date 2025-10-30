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
        System.out.println("4. Show Edge Cases test.");

        int choice = readIntInRange(0, 4, "Choose a number to Start the test, or (0) to exit -> ");
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

            case 4:
                edgeCaseTest();
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

    private static void edgeCaseTest() {

        System.out.println("===== Edge Cases Test =====");
        System.out.println("===== Edge Case 1 =====");
        System.out.println("Setting radius for Circle c1 = 0");
        Circle c1 = new Circle(0);
        System.out.printf("The Area of Circle c1 Object = %.2f \n", c1.calculateArea());
        System.out.printf("The Circumference of Circle c1 Object = %.2f \n", c1.calculateCircumference());

        System.out.println();

        System.out.println("===== Edge Case 2 =====");
        System.out.println("Inputting a letter in int");
        int choice = readIntInRange(-999999999, 999999999, "You are now prompted to input a number, try a letter -> ");

        System.out.println();

        System.out.println("===== Edge Case 3 =====");
        System.out.println("Inputting a out of range number in int");
        choice = readIntInRange(1, 100, "You are now prompted to input a number in range (1-100), try out of range -> ");

        System.out.println();
    }

    private static void triangleTest() {
        System.out.println("===== Triangle Test =====");

        double height = 0, base = 0;
        height = readDoubleInRange(-999999,999999,"Enter Height for Object tri1 ->");
        base = readDoubleInRange(-999999,999999,"Enter Base for Object tri1 ->");
        Triangle tri1 = new Triangle(height, base);

        height = readDoubleInRange(-999999,999999,"Enter Height for Object tri2 ->");
        base = readDoubleInRange(-999999,999999,"Enter Base for Object tri2 ->");
        Triangle tri2 = new Triangle(height, base);

        height = readDoubleInRange(-999999,999999,"Enter Height for Object tri3 ->");
        base = readDoubleInRange(-999999,999999,"Enter Base for Object tri3 ->");
        Triangle tri3 = new Triangle(height, base);

        System.out.println("Triangle tri2 height: " + tri2.getHeight());
        System.out.println("Triangle tri2 base: " + tri2.getBase());
        tri3.setHeight(10);
        tri3.setBase(12);
        System.out.println("Triangle tri3 height after using Mutator and setting it to 10: " + tri3.getHeight());
        System.out.println("Triangle tri3 width after using Mutator and setting it to 12: " + tri3.getBase());
        System.out.println();
        System.out.printf("The Area of Triangle tri1 Object = %.2f \n", tri1.calculateArea());
        System.out.printf("The Perimeter of Triangle tri1 Object = %.2f \n", tri1.calculateCircumference());

        System.out.println();
    }

    private static void rectangleTest() {
        System.out.println("===== Rectangle Test =====");

        double height = 0, width = 0;
        height = readDoubleInRange(-999999,999999,"Enter Height for Object rec1 ->");
        width = readDoubleInRange(-999999,999999,"Enter Width for Object rec1 ->");
        Rectangle rec1 = new Rectangle(height, width);

        height = readDoubleInRange(-999999,999999,"Enter Height for Object rec2 ->");
        width = readDoubleInRange(-999999,999999,"Enter Width for Object rec2 ->");
        Rectangle rec2 = new Rectangle(height, width);

        height = readDoubleInRange(-999999,999999,"Enter Height for Object rec3 ->");
        width = readDoubleInRange(-999999,999999,"Enter Width for Object rec3 ->");
        Rectangle rec3 = new Rectangle(height, width);

        System.out.println("Rectangle rec2 height: " + rec2.getHeight());
        System.out.println("Rectangle rec2 width: " + rec2.getWidth());
        rec3.setHeight(12);
        rec3.setWidth(6);
        System.out.println("Rectangle rec3 height after using Mutator and setting it to 12: " + rec3.getHeight());
        System.out.println("Rectangle rec3 width after using Mutator and setting it to 6: " + rec3.getWidth());
        System.out.println();
        System.out.printf("The Area of Rectangle rec1 Object = %.2f \n", rec1.calculateArea());
        System.out.printf("The Perimeter of Rectangle rec1 Object = %.2f \n", rec1.calculateCircumference());

        System.out.println();
    }

    private static void circleTest() {
        System.out.println("===== Circle Test =====");

        double radius = 0;
        radius = readDoubleInRange(-999999,999999,"Enter Radius for Object c1 ->");
        Circle c1 = new Circle(radius);
        radius = readDoubleInRange(-999999,999999,"Enter Radius for Object c2 ->");
        Circle c2 = new Circle(radius);
        radius = readDoubleInRange(-999999,999999,"Enter Radius for Object c3 ->");
        Circle c3 = new Circle(radius);

        System.out.println("Circle c2 radius: " + c2.getRadius());
        c3.setRadius(12);
        System.out.println("Circle c3 radius after using Mutator and setting it to 12 : " + c3.getRadius());
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
            startTest();
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

    private static double readDoubleInRange(double from, double to, String message) throws IllegalArgumentException{
        Scanner input = new Scanner(System.in);

        try {
            if(from > to)
                throw new IllegalArgumentException("Invalid Range argument for reading int!!!");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            startTest();
        }

        boolean valid = false;
        double number = 0;
        do {
            try {
                System.out.print(message);
                number = input.nextDouble();
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