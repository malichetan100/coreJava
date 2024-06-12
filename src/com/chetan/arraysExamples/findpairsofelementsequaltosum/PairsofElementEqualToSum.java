package com.chetan.arraysExamples.findpairsofelementsequaltosum;

public class PairsofElementEqualToSum {

    public int[][] pairedElements(int[] arr, int sum) {

        int low = 0;
        int high = arr.length -1;

        int[][] newArray = new int[low][high];
        while (low < high) {
            if (arr[low] + arr[high] == sum) {
                 newArray[low][high]=newArray[low+1][high];
                //ystem.out.println(" ("+ arr[low] + ", " + arr[high] + ")");
            }
            if (arr[low] + arr[high] > sum) {
                high--;
            }
            else {
                low++;
            }
        }
        return newArray;
    }
}