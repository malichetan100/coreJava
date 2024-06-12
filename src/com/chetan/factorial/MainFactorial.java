package com.chetan.factorial;

import java.util.Scanner;

public class MainFactorial {
    public static void main(String args[])
    {
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter an number to calculate the factorial: ");
        int number=scr.nextInt();
        FactorialNumber factorialNumber=new FactorialNumber();
        factorialNumber.doFactorial(number);

    }
}
