package com.chetan.Inheritance.Shape;

public class Rectangle extends Shape {
    int breadth,length;

    public Rectangle(String color, int breadth, int length) {
        super(color);
        this.breadth = breadth;
        this.length = length;
    }

    public void calculateAreaOfRetangle()
    {
        int areaOfrectangle=length*breadth;
        System.out.println("The Area of Rectangle is: "+areaOfrectangle);
    }
}
