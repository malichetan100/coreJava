package com.chetan.sorting.dsa;

import java.util.Arrays;

public class MainMergeSort {
    public static void main(String[] args) {
        int arr[]={3,5,4,8,1,2,7};
        MergeSort mergeSort=new MergeSort();
        int [] ascOrderResult=mergeSort.peformMergeSortAsc(arr);
        System.out.println(Arrays.toString(ascOrderResult));

        int[] descOrderResult=mergeSort.peformMergeSortDesc(arr);
        System.out.println(Arrays.toString(descOrderResult));
    }
}
