package com.sda.j2.examples.zad9;

public class CircleWithRadius {

    private final Point2D center;
    private final double radius;

    public CircleWithRadius(Point2D center, Point2D point) {
        this.center = center;
        this.radius = Math.sqrt(Math.pow(center.getX() - point.getX(), 2) + Math.pow(center.getY() - point.getY(), 2));
    }

    public double getRadius() {
        return radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

}
