package com.abualim.solid;

public class Square implements Shape {
    private final int length;

    public int getLength() {
        return length;
    }

    public Square(int length) {
        this.length = length;
    }

    @Override
    public double area() {
        return Math.pow(getLength(), 2);
    }
}
