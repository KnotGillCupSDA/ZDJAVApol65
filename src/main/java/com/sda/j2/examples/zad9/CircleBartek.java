package com.sda.j2.examples.zad9;

public class CircleBartek {

    private final Point2D center;
    private final Point2D point;

    public CircleBartek(Point2D center, Point2D point) {
        this.center = center;
        this.point = point;
    }

    double getRadius() {
        return Math.sqrt(Math.pow(center.getX() - point.getX(), 2) + Math.pow(center.getY() - point.getY(), 2));
    }

    double getPerimeter() {
        return 2 * Math.PI * getRadius();
    }

    double getArea() {
        return Math.pow(getRadius(), 2) * Math.PI;
    }

}
