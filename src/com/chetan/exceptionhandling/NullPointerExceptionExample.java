package com.chetan.exceptionhandling;

import java.util.Scanner;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Enter an String: ");
//        String str=scanner.next();
        String str=null;

        try{
            int stringSize=str.length();
            System.out.println("The Length of string is: "+stringSize);
        }
        catch (NullPointerException ex)
        {
            System.out.println(ex);
        }

    }
}
