package org.akash.java.shape;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 2*Math.PI*this.radius;
    }

    @Override
    public double perimeter() {
        return Math.PI*Math.pow(this.radius,2);
    }
}
