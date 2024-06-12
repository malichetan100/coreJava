package com.chetan.arraysExamples.numberinarray;

import com.chetan.arraysExamples.middlearray.MiddleArray;

import java.util.Scanner;

public class MainNumberInArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        NumberInArray numberInArray=new NumberInArray();
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

        System.out.println("Enter an number to find in array: ");
        int target=scanner.nextInt();

        boolean result=numberInArray.isNumberInArray(userarray,target);

        System.out.println(result);

    }
}
