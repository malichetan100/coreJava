package com.chetan.factorial;

public class FactorialNumber {
    public void doFactorial(int number)
    {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        System.out.println("The factorial of given number is: " + factorial);
    }
}
