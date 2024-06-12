package com.chetan.fibonacciseries;

public class Fibonacci {

    public void doFibonacci(int number)
    {
        int fib1=0;
        int fib2=1;
        System.out.print(fib1+" "+fib2);
        for(int i=0;i<number;i++)
        {
        int fib=fib1+fib2;
        System.out.print(" "+fib);
        fib1=fib2;  //fib1=1, fib1=1 fib1=2 fib1=3
        fib2=fib;  //fib2=1  fib2=2   fib2=3 fib2=5

        }
    }
}
