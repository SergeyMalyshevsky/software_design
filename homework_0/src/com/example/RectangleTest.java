package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {

    @Test
    void getArea() {
        double height = 5;
        double width = 10;
        double area = height * width;
        Rectangle rectangle = new Rectangle(height, width);

        assertEquals(area, rectangle.getArea());
    }
}