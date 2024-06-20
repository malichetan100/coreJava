package com.chetan.methods;

import java.util.Scanner;

public class MainGreatestNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter an first number: ");
        int number1=scanner.nextInt();
        System.out.println("Enter an second number: ");
        int number2=scanner.nextInt();
        GreatestNumbers greatestNumbers=new GreatestNumbers();
        int resNumber=greatestNumbers.giveGreaterNumber(number1,number2);
        System.out.println("The Greater number is: "+resNumber);
    }
}
