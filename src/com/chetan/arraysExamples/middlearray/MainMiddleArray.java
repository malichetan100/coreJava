package com.chetan.arraysExamples.middlearray;

import java.util.Scanner;

public class MainMiddleArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        MiddleArray middleArray=new MiddleArray();
        System.out.println("Enter an size of an array: ");
        int size= scanner.nextInt();
        int[] userarray = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("enter the element no " + i);
            userarray[i] = scanner.nextInt();
        }

        for(int i=0;i<userarray.length;i++)
        {
            System.out.print(userarray[i]+" ");
        }
        System.out.println();

        middleArray.createMiddle(userarray);


    }
}
