package com.chetan.exceptionhandling;

import java.util.Scanner;

public class ArithmaticExcptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an number1: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter an number2: ");
        int number2 = scanner.nextInt();

        int addtionResult = number1 + number2;
        System.out.println("Addition od 2 numbers is: " + addtionResult);

        int subResult = number1 - number2;
        System.out.println("Substraction result is: " + subResult);

        int mulResult = number1 * number2;
        System.out.println("Multiplication result is: " + mulResult);

        try {
            int divResult = number1 / number2;
            System.out.println("Division result is: " + divResult);
        }
        catch (ArithmeticException ex){
            System.out.println("The number can not be zero");
        }
//        finally {
//            System.out.println("Working Fine");
//       }

    }
}
