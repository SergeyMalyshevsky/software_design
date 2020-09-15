package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class QuadrateTest {

    @Test
    void getArea() {
        double width = 5;
        Quadrate quadrate = new Quadrate(width);

        assertEquals(width * width, quadrate.getArea());
    }
}