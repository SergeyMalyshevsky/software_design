package com.example;

public class Quadrate extends Figure {
    private double width;

    public Quadrate(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return width * width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}