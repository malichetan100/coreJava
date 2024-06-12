package com.chetan.sorting.dsa;

import java.util.Arrays;

public class MainSelectionSort {
    public static void main(String[] args) {
        int[] array = {10,1,34,90,5};
        System.out.println("Using Selection Sort");
        SelectionSort selectionSort = new SelectionSort();
        System.out.println(Arrays.toString(selectionSort.doSortAsc(array)));
        System.out.println(Arrays.toString(selectionSort.doSortDesc(array)));

    }
}
