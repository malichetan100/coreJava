package com.chetan.sorting.dsa;

public class SelectionSort {
    public int[] doSortAsc(int arr[]) {

        int temp;
        // loop will do the iterations
        for (int i = 0; i < arr.length; i++) {

            int min_index = i;
            // loop will compare the elements with each other and find the min_index value.
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
                // swap the elements
                temp = arr[min_index];
                arr[min_index] = arr[i];
                arr[i] = temp;
            }
        }
        return arr;
    }

    public int[] doSortDesc(int arr[]) {

        int temp;

        // loop will do the iterations
        for (int i = 0; i < arr.length; i++) {

            int max_index = i;
            // loop will compare the elements with each other.
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[max_index]) {
                    max_index = j;
                }
                // swap the elements
                temp = arr[max_index];
                arr[max_index] = arr[i];
                arr[i] = temp;
            }
        }
        return arr;
    }
}
