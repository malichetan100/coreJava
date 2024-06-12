package com.chetan.input;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String args[]) {
        //Area = πr2
        double pie = 3.14;
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the radius value: ");
        int radius = scr.nextInt();
        int sq = radius ^ 2;
        System.out.println(sq);
        double area = pie * (radius * radius);
        System.out.println("The Area of given radius for the circle is: " + area);

    }
}
