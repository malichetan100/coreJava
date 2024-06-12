package com.chetan.sumofdigits;

import java.util.Scanner;

public class MainSumOfDigits {
    public static void main(String srgs[])
    {
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter an number to calculate the sum of digits: ");
        int number= scr.nextInt();
        SumOfDigits sumOfDigits=new SumOfDigits();
        sumOfDigits.calculateSumOfDigits(number);
        System.out.println("--------------------------------------------");
        System.out.println("Enter an number to calculate the sum of digits: ");
        int number2= scr.nextInt();
        sumOfDigits.calculateSumOfDigits1(number2);
    }
}

