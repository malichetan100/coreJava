package com.chetan.exceptionhandling;

public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        String str="Chetan";
        System.out.println("The Name is: "+str);
        try{
            int i=Integer.parseInt(str);
        }
        catch (NumberFormatException ex)
        {
            System.out.println(ex);
        }

    }
}
