package com.chetan.Interviewquestions;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter an String: ");
        String reverseString=scanner.next();
        String rev="";
        for(int i=reverseString.length()-1;i>=0;i--){
            rev=rev+reverseString.charAt(i);
        }
        System.out.println(rev);

      //checking Pallindrome
        if(reverseString.equals(rev)){
            System.out.println("Pallindrome");
        }
        else {
            System.out.println("Not Pallindrome");
        }
    }
}
