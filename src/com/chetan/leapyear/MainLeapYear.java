package com.chetan.leapyear;

import java.util.Scanner;

public class MainLeapYear {
    public static void main(String args[])
    {
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter an Year: ");
        int year=scr.nextInt();

        LeapYear leapYear=new LeapYear();
        leapYear.cheakLeapYear(year);
    }
}
