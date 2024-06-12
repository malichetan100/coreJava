package com.chetan.sorting.dsa;

import java.util.Arrays;

public class MainInsertionSort {
    public static void main(String[] args) {
        int arr[]={20,10,5};

        InsertionSort insertionSort=new InsertionSort();
       int [] resulArray1 = insertionSort.performInsertionSortAsc(arr);
        System.out.println(Arrays.toString(resulArray1));

        int[] resultArray2=insertionSort.performInsertionSortDesc(arr);
        System.out.println(Arrays.toString(resultArray2));
    }

}
