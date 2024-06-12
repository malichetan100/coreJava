package com.chetan.fibonacciseries;

import java.util.Scanner;

public class MainFibonacci {
    public static void main(String args[])
    {
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter an number to until to print number");
        int number=scr.nextInt();
        Fibonacci fibonacci=new Fibonacci();
        fibonacci.doFibonacci(number);
    }
}
