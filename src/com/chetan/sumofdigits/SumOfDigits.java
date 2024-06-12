package com.chetan.sumofdigits;

public class SumOfDigits {
    public void calculateSumOfDigits(int number)
    {
        int sumResult=0;
        int digit;
        while(number>0)
        {
        digit=number%10;
        sumResult=sumResult+digit;
        number=number/10;
        }

        System.out.println("The Sum of digits from number is: "+sumResult);
    }

    public void calculateSumOfDigits1(int number)
    {
        int sumResults1=0;
        for(int i=0;i<=number;i++)
        {
            sumResults1=sumResults1+i;
        }
        System.out.println("The Sum Results of digits is: "+sumResults1);
    }
}
