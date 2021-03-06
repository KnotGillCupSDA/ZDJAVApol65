package com.sda.j2.examples.zad10;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(new Point2D(0.0, 0.0), new Point2D(1.0, 0.0));
        System.out.println("radius: "+ circle.getRadius());
        System.out.println("perimeter: "+ circle.getPerimeter());
        System.out.println("area: "+ circle.getArea());

        circle.move(new MoveDirection(1.0, 0.0));
        //debug to see inner field values
        //alternatively add getter methods and print them on stdout
    }
}
