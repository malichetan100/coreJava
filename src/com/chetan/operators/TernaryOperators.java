package com.chetan.operators;

import java.util.Scanner;

public class TernaryOperators {
    public static void main(String args[])
    {
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter an number to check Even or odd");
        int number=scr.nextInt();
        String result= ((number%2 == 0) ? "Even": "Odd");
        System.out.println("The number is: "+result);
    }
}
