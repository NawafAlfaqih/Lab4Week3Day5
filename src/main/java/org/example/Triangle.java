package org.example;

public class Triangle extends Shape {

    private double height;
    private double base;

    public Triangle () {}

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double calculateArea() {
        return (getHeight() * getBase()) / 2;
    }

    @Override
    public double calculateCircumference() {
        return getBase() * 3; //Perimeter
    }
}
