package com.chetan.arraysExamples;

import java.util.Arrays;

public class SumOfElementsInArray {
    public static int[] sumOfTwoNumbers(int arr[],int target)
    {

        for(int i = 0; i<arr.length;i++)
    {
        for (int j = i + 1; j < arr.length; j++) {
            if (target == arr[i] + arr[j]) {
                //   System.out.println(i+","+j);
               return new int[]{i,j};
                //res[j]=arr[j];
            }

        }

    }
        return arr;
}

public static void main(String[] args) {
    int arr[] = {2, 7, 11, 15};
    //{3,2,4};
    //{2, 7, 11, 15}
    int target = 9;
    //9
   int[] res= SumOfElementsInArray.sumOfTwoNumbers(arr,target);
    System.out.println(Arrays.toString(res));
}

}
