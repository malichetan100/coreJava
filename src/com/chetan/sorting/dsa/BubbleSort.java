package com.chetan.sorting.dsa;

public class BubbleSort {
    public int[] doSortAsc(int []arr)
    {
        int temp;
        for(int i=0;i<arr.length;i++) {
            //loop will compare the elements with each other.
            for(int j=1;j<(arr.length-i);j++) {
                if(arr[j-1]>arr[j]) {
                    //swap the elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }

    public int[] doSortDes(int []arr)
    {
        int temp;
        for(int i=0;i<arr.length;i++) {
            //loop will compare the elements with each other.
            for(int j=1;j<(arr.length-i);j++) {
                if(arr[j-1]<arr[j]) {
                    //swap the elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
 }

