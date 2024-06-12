package com.chetan.pallindrome;

public class PalindromeOfString {

    public void displayPallindromeOrNot(String sentence)
    {
        String rev="";
        char ch[]=sentence.toCharArray();
        for(int i=ch.length-1;i>=0;i--)
        {
            rev=rev+ch[i];
        }

        System.out.println("The reverse of mentioned string is: "+rev);

        if(rev.equals(sentence))
        {
            System.out.println("Given String is a Palindrome");
        }
        else {
            System.out.println("Given String is a Not Palindrome");
        }

    }
}
