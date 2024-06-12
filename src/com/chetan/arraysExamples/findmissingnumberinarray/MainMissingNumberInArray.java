package com.chetan.arraysExamples.findmissingnumberinarray;

import com.chetan.arraysExamples.getfirstandsecondhighestmarks.FirstAndSecondHighestMarks;

import java.util.Scanner;

public class MainMissingNumberInArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        MissingNumberInArray missingNumberInArray=new MissingNumberInArray();
        System.out.println("Enter an size of an array: ");
        int size= scanner.nextInt();
        int[] userarray = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("enter the element no " + i);
            userarray[i] = scanner.nextInt();
        }

        int missingNumber=missingNumberInArray.findMissingNumberInArray(userarray);
        System.out.println("The missing number from array is: "+missingNumber);

    }
}
