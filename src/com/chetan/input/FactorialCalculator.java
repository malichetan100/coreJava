package com.chetan.input;

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String args[]) {
        int factorial = 1;
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scr.nextInt();
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        System.out.println("The factorial of given number is: " + factorial);

    }
}
