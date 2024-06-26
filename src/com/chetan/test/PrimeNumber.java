package com.chetan.test;

public class PrimeNumber {
    public static void main(String[] args) {
       //char[] ch={''}
        int number = 13;
        int count = 0;
        for (int i = 1; i<number/2; i++) {
            if ( number % i == 0) {
                count++;
            }
        }
        System.out.println(count);
        if(count==1)
        {
            System.out.println("Prime");
        }
        else {
            System.out.println("Not Prime");
        }
    }

}

