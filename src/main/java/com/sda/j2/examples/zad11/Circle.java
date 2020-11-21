package com.sda.j2.examples.zad11;

public class Circle implements Movable, Resizable {

    private final Point2D center;

    private double radius;
    private double perimeter;
    private double area;

    public Circle(Point2D center, Point2D point) {
        this.center = center;

        radius = Math.sqrt(Math.pow(center.getX() - point.getX(), 2) + Math.pow(center.getY() - point.getY(), 2));
        calculatePerimeter();
        calculateArea();
    }

    private void calculatePerimeter() {
        perimeter = 2 * Math.PI * radius;
    }

    private void calculateArea() {
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

    @Override
    public void move(MoveDirection moveDirection) {
        center.move(moveDirection);
    }

    @Override
    public void resize(double resizeFactor) {
        radius *= resizeFactor;
        calculatePerimeter();
        calculateArea();
    }
}
