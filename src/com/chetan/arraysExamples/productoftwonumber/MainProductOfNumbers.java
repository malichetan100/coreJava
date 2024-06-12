package com.chetan.arraysExamples.productoftwonumber;

import com.chetan.arraysExamples.getfirstandsecondhighestmarks.FirstAndSecondHighestMarks;

import java.util.Scanner;

public class MainProductOfNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ProductOfNumbers productOfNumbers=new ProductOfNumbers();
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

        System.out.println(productOfNumbers.maxProduct(userarray));
    }
}
