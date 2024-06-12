package com.chetan.input;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String args[])
    {
        // F = (9/5)C + 32

        Scanner scr=new Scanner(System.in);
        System.out.println("Enter the celsius value :");
        int temp_C=scr.nextInt();

        double temp_F=((9*temp_C)/5)+32;
        System.out.println("The result of Celsius To Fahrenheit :"+ temp_F);

        System.out.println("Enter the celsius value :");
        int temp_F1=scr.nextInt();
        double temp_C1=(temp_F1-32)*5/9;
        System.out.println("The result of Fahrenheit to Celsius :"+ temp_C1);

    }
}
