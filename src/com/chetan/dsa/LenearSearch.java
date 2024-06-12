package com.chetan.dsa;

import java.util.Scanner;

public class LenearSearch {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        int a[]={1,10,12,33,55,25};
        System.out.println("Enter an number to search: ");
        int numberToSearch=scr.nextInt();

        for(int i=0;i<a.length;i++)
        {
            if(numberToSearch==a[i]) {
                System.out.println("Number found at position : " + i);
            }
        }
        System.out.println("Given number is not found in array");

    }
}
