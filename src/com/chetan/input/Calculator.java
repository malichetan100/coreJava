package com.chetan.input;

import java.util.Scanner;

public class Calculator {
    public static void main(String args[]) {
      /*  int number1;
        int number2;
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        number1 = scr.nextInt();
        System.out.println("Enter the Second Number: ");
        number2 = scr.nextInt();

        System.out.println("The sum of two numbers is: "+(number1+number2));
        System.out.println("The Substraction of two numbers is: "+(number1-number2));
        System.out.println("The multiplication of two numbers is: "+(number1*number2));
        System.out.println("The Division of two numbers is: "+(number1/number2));
        System.out.println("The Modulus of two numbers is: "+(number1%number2)); */

        Scanner scr=new Scanner(System.in);
        int number1;
        int number2;
        int choice;
        System.out.println("Enter the First Number: ");
        number1 = scr.nextInt();
        System.out.println("Enter the Second Number: ");
        number2 = scr.nextInt();
        System.out.println("Enter your choice");
        choice=scr.nextInt();
        switch (choice){
            case 1:
                System.out.println("The sum of two numbers is: "+(number1+number2));
                break;

            case 2:
                System.out.println("The Substraction of two numbers is: "+(number1-number2));
                break;

            case 3:
                System.out.println("The multiplication of two numbers is: "+(number1*number2));
                break;

            case 4:
                System.out.println("The Division of two numbers is: "+(number1/number2));
                break;

            case 5:
                System.out.println("The Modulus of two numbers is: "+(number1%number2));
                break;

            default:
                System.out.println("Invalid choice");
        }
        //scr.close();
    }
}
