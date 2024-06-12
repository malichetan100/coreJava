package com.chetan.arraysExamples.productoftwonumber;

import java.util.Arrays;

public class ProductOfNumbers {

    public int maxProduct(int[] arr) {
        int firstHigh = 0;
        int secondtHigh = 0;
       // Arrays.sort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            firstHigh = arr[arr.length - 1];
            secondtHigh = arr[arr.length - 2];
            break;
        }
        int productOfMaximumNumbers=firstHigh*secondtHigh;
    //    System.out.println("product of 2 maximum numbers is " + productOfMaximumNumbers);
        return productOfMaximumNumbers;
    }
}
