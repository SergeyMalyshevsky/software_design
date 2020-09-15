package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CircleTest {

    @org.junit.jupiter.api.Test
    void getArea() {
        double radius = 10;
        double area = Math.PI * radius * radius;
        Circle circle = new Circle(radius);

        assertEquals(area, circle.getArea());
    }
}