package com.chetan.methods;

import java.util.Scanner;

public class MainCalculator {
    public static void main(String args[])
    {
     int number1,number2;
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter an Number1: ");
        number1=scr.nextInt();
        System.out.println("Enter an Number2: ");
        number2=scr.nextInt();
        Calculator calculator =new Calculator();
        int sum=calculator.doAddition(number1,number2);
        System.out.println("The sum of numbers two are: "+sum);
        int result=calculator.doMultiplication(number1,number2);
        System.out.println("The multiplication of two numbers are: "+result);

    }
}
