package com.chetan.input;

import java.util.Scanner;

public class CountVowels {
    public static void main(String args[]) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter sentence : ");
        String word = scr.nextLine();
        char c[] = word.toCharArray();
        int count = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u'
                    || c[i] == 'A' || c[i] == 'E' || c[i] == 'I' || c[i] == 'O' || c[i] == 'U') {
                count++;
            }
        }
        System.out.println("The number vowels present in the String is :" + count);
    }
}
