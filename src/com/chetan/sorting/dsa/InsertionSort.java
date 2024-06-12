package com.chetan.sorting.dsa;

public class InsertionSort {

    public int[] performInsertionSortAsc(int[] array) {

        int key;
        int i ;
        for(int j=1;j<array.length;j++) {

            key =array[j];
            i = j-1;

            while(i>-1 && array[i]>key) {
                array[i+1] = array[i];
                i--;
            }
            array[i+1]= key;
        }
        return array;
    }

    public int[] performInsertionSortDesc(int[] array) {

        int key;
        int i ;
        for(int j=1;j<array.length;j++) {

            key =array[j];
            i = j-1;

            while(i>-1 && array[i]<key) {
                array[i+1] = array[i];
                i--;
            }
            array[i+1]= key;
        }
        return array;
    }

}
