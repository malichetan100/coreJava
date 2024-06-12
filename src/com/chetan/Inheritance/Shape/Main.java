package com.chetan.Inheritance.Shape;

public class Main {
    public static void main(String[] args) {

        Circle circle=new Circle("Blue",3.14,2);
        circle.calculateAreaOfCircle();

        Circle circle1=new Circle("Black",3.14,8);
        circle1.calculateAreaOfCircle();

        Rectangle rectangle=new Rectangle("Red",2,5);
        rectangle.calculateAreaOfRetangle();

    }
}
