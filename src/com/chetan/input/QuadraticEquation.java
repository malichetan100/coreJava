package com.chetan.input;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String args[]) {
        int a;
        int b;
        int c;
        int x;
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        a = scr.nextInt();
        System.out.println("Enter the Second Number: ");
        b = scr.nextInt();
        System.out.println("Enter the Third Number: ");
        c = scr.nextInt();
        System.out.println("Enter the x Number: ");
        x = scr.nextInt();
        // ax^2 + bx + c = 0.
        int quadricEquationResult = (a * (x ^ 2) + (b * x) + c);
        System.out.println("Result is : " + quadricEquationResult);

        if (quadricEquationResult == 0) {
            System.out.println("Quadric Equation");
        } else {
            System.out.println("Not Quadric Equation");
        }

    }
}
