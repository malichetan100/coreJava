package com.chetan.reactangle;

import java.util.Scanner;

public class MainAreaAndPerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter an length value: ");
        int length=scr.nextInt();

        System.out.println("Enter an weadth value: ");
        int weadth=scr.nextInt();

        AreaAndPerimeterOfRectangle areaAndPerimeterOfRectangle=new AreaAndPerimeterOfRectangle();
        areaAndPerimeterOfRectangle.calculateAreaAndPerimeterOfRectangle(length,weadth);

    }
}
