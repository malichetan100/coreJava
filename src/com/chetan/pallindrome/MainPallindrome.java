package com.chetan.pallindrome;

import java.util.Scanner;

public class MainPallindrome {
    public static void  main(String args[])
    {
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter an string to to reverse :");
        String sentence=scr.nextLine();
        PalindromeOfString palindromeOfString=new PalindromeOfString();
        palindromeOfString.displayPallindromeOrNot(sentence);
    }
}
