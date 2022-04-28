package com.abualim.solid;

public class Cube implements Shape, ThreeDimensionalShape {
    private final int sideLength;

    public Cube(int sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double area() {
        return 6 * sideLength;
    }

    @Override
    public double volume() {
        return Math.pow(sideLength, 3);
    }
}
