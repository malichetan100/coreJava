package com.chetan.sorting.dsa;

import java.util.Arrays;

public class MainBubbleSorting {
    public static void main(String[] args) {
        int[] array = {10,1,34,90,5};

        //Bubble Sort
        System.out.println("Using Bubble Sort");
        BubbleSort bubbleSort = new BubbleSort();
        System.out.println(Arrays.toString(bubbleSort.doSortAsc(array)));
        System.out.println(Arrays.toString(bubbleSort.doSortDes(array)));
    }
}
