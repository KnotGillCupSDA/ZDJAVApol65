package com.sda.j2.examples.zad9;

public class CircleWithoutPoints {

    private final double radius;
    private final double perimeter;
    private final double area;

    public CircleWithoutPoints(Point2D center, Point2D point) {
        radius = Math.sqrt(Math.pow(center.getX() - point.getX(), 2) + Math.pow(center.getY() - point.getY(), 2));
        perimeter = 2 * Math.PI * radius;
        area = Math.pow(radius, 2) * Math.PI;
    }

    double getRadius() {
        return radius;
    }

    double getPerimeter() {
        return perimeter;
    }

    double getArea() {
        return area;
    }

}
