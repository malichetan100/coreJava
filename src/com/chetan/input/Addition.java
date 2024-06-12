package com.chetan.input;

import java.util.Scanner;

public class Addition {
    public static void main(String args[]) {
        int number1;
        int number2;
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        number1 = scr.nextInt();
        System.out.println("Enter the Second Number: ");
        number2 = scr.nextInt();
        int additionResult = number1 + number2;
        System.out.println("The sum of two number is :" + additionResult);
        System.out.println("Enter the name:");
        String name = scr.next();
        System.out.println("Entered String value is:" + name);
        scr.close();

    }
}
