package com.example;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(5, 8);
        System.out.println("Rectangle area is " + rectangle.getArea());

        Quadrate quadrate = new Quadrate(5);
        System.out.println("Quadrate area is " + quadrate.getArea());

        Circle circle = new Circle(5);
        System.out.println("Circle area is " + circle.getArea());

    }
}