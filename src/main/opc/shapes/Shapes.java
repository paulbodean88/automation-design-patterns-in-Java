package main.opc.shapes;

import java.io.OutputStream;

interface Shape {
    public double calculateArea();
}

class Rectangle implements Shape {
    public double length;
    public double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

class Circle implements Shape {
    public double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class AreaCalculator {
    public double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    public static void main(String[] args) {
        AreaCalculator area = new AreaCalculator();
        Circle circle = new Circle(5);
        System.out.println(area.calculateArea(circle));
        Rectangle rectangle = new Rectangle(5, 5);
        System.out.println(area.calculateArea(rectangle));
    }
}