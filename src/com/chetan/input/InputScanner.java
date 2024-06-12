package com.chetan.input;

import java.util.Scanner;

public class InputScanner {
    public static void main(String args[])
    {
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter the number to display");
        int number1=scr.nextInt();
        System.out.println("The entered value is: "+number1);
        scr.close();
    }
}
