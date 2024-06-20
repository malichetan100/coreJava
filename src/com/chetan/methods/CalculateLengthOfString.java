package com.chetan.methods;

public class CalculateLengthOfString {

    public int calculateLengthOfString(String str){

        return str.length();
    }

    public boolean checkEvenNumber

            (int number)
    {
        if(number%2 == 0)
        {
            return true;
        }
        return false;
    }

    public int giveSquareOfNumber(int number)
    {
        return number*number;
    }

    public double giveSquareOfNumberDouble(double number1, double number2)
    {
        return Math.pow(number1,number2);
    }

    public void printTableOfNumber(int number){

        for(int i=1;i<=10;i++)
        {
            System.out.println(number+" * "+i+" = "+ number*i );
        }

    }

    public int calculateFactorialOfNumber(int num){
        int fact=1;
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        return fact;
    }
}
