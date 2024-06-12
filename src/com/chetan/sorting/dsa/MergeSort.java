package com.chetan.sorting.dsa;

public class MergeSort {

    public int[] peformMergeSortAsc(int[] array) {


        if(array.length>1) {
            //find the middle of the array to split
            int mid = array.length/2;

            //create two sub arrays
            int[] leftArray = new int[mid];
            int[] rightArray = new int[array.length-mid];

            //fill the values in the sub array
            for(int i = 0; i< mid; i++) {
                leftArray[i]= array[i];
            }

            for(int i = mid; i<array.length;i++) {
                rightArray[i-mid] = array[i];
            }

            peformMergeSortAsc(leftArray);
            peformMergeSortAsc(rightArray);

            //Merge the arrays

            int i=0;
            int j=0;
            int k=0;
            //merge function is important
            //two loops/variable as we have to merge two arrays together
            while(i < leftArray.length && j < rightArray.length) {

                if(leftArray[i]<rightArray[j]) {
                    array[k]=leftArray[i];
                    i++;
                }
                else {
                    array[k]= rightArray[j];
                    j++;
                }
                k++;
            }

            //collect the remaining elements
            while(i<leftArray.length) {
                array[k]= leftArray[i];
                i++;
                k++;

            }

            while(j<rightArray.length) {
                array[k]= rightArray[j];
                j++;
                k++;

            }

        }
        return array;
    }


    public int[] peformMergeSortDesc(int[] array) {


        if(array.length>1) {
            //find the middle of the array to split
            int mid = array.length/2;

            //create two sub arrays
            int[] leftArray = new int[mid];
            int[] rightArray = new int[array.length-mid];

            //fill the values in the sub array
            for(int i = 0; i< mid; i++) {
                leftArray[i]= array[i];
            }

            for(int i = mid; i<array.length;i++) {
                rightArray[i-mid] = array[i];
            }

            peformMergeSortDesc(leftArray);
            peformMergeSortDesc(rightArray);

            //Merge the arrays

            int i=0;
            int j=0;
            int k=0;
            //merge function is important
            //two loops/variable as we have to merge two arrays together
            while(i < leftArray.length && j < rightArray.length) {

                if(leftArray[i]>rightArray[j]) {
                    array[k]=leftArray[i];
                    i++;
                }
                else {
                    array[k]= rightArray[j];
                    j++;
                }
                k++;
            }

            //collect the remaining elements
            while(i<leftArray.length) {
                array[k]= leftArray[i];
                i++;
                k++;

            }

            while(j<rightArray.length) {
                array[k]= rightArray[j];
                j++;
                k++;

            }

        }
        return array;
    }

}
