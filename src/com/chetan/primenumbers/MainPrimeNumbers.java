package com.chetan.primenumbers;

import java.util.Scanner;

public class MainPrimeNumbers {
    public static void main(String args[])
    {
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter an Number to check prime number or not: ");
        int number=scr.nextInt();

        PrimeNumbers primeNumbers=new PrimeNumbers();
        primeNumbers.isPrimeNumber(number);
    }
}
