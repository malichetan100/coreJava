package com.chetan.Inheritance.Shape;

public class Circle extends Shape{
    double pi;
    int radius;

    public Circle(String color, double pi, int radius) {
        super(color);
        this.pi = pi;
        this.radius = radius;
    }

    public void calculateAreaOfCircle()
    {
        double areaOfCircle=2*pi*(radius*radius);
        System.out.println("The Area of Circle is: "+areaOfCircle);
    }
}
