package com.chetan.arraysExamples.getfirstandsecondhighestmarks;

import java.util.Arrays;

public class FirstAndSecondHighestMarks {

    public void getFirstAndSecondHighestMarks(int arr[],int n) {
        int firstHigh = 0;
        int secondtHigh=0;
        Arrays.sort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        for (int i=0;i< arr.length;i++)
        {
             firstHigh= arr[arr.length-1];
             secondtHigh= arr[arr.length-2];
            break;
        }
        System.out.println("firstHigh "+firstHigh);
        System.out.println("secondHigh "+secondtHigh);

    }
}
