package main.opc.shapes;

class RectangleBefore {
    public double length;
    public double width;
}

class CircleBefore {
    public double radius;
}

class AreaCalculatorBefore {
    public double calculateRectangleArea(Rectangle rectangle) {
        return rectangle.length * rectangle.width;
    }

    public double calculateCircleArea(Circle circle) {
        return (22 / 7) * circle.radius * circle.radius;
    }
}


