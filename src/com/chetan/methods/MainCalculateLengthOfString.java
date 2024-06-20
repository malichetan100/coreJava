package com.chetan.methods;

import java.util.Scanner;

public class MainCalculateLengthOfString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter an String");
        String name=scanner.next();
        CalculateLengthOfString calculateLengthOfString=new CalculateLengthOfString();
        int resLength=calculateLengthOfString.calculateLengthOfString(name);
        System.out.println("The Length of string is : "+resLength);

        System.out.println("Enter an number to check Even: ");
        int number=scanner.nextInt();
        boolean resEvenOrOdd=calculateLengthOfString.checkEvenNumber(number);
        System.out.println(resEvenOrOdd);

        int resSquare=calculateLengthOfString.giveSquareOfNumber(number);
        System.out.println("Square of number is: "+resSquare);

        double resuSquare1=calculateLengthOfString.giveSquareOfNumberDouble(number,2);
        System.out.println(resuSquare1);

        calculateLengthOfString.printTableOfNumber(number);

        int resFactorial= calculateLengthOfString.calculateFactorialOfNumber(number);
        System.out.println("The Factorial of number is: "+resFactorial);

    }
}
