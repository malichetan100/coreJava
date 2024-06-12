package com.chetan.input;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String args[]) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the principle amount: ");
        int principleAmount = scr.nextInt();
        System.out.println("Enter the time period amount: ");
        int timePeriod = scr.nextInt();
        System.out.println("Enter the rate of interest amount: ");
        double rateOfInterest = scr.nextDouble();

        double simpleInterest = (principleAmount * timePeriod * rateOfInterest) / 100;

        System.out.println("The Simple Interest is: " + simpleInterest);
    }
}
