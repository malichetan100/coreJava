package com.chetan.arraysExamples.arrys;

public class ReverseArray {
    public int[] reverseArray(int []arr)
    {
        int temp=0;
        int startIndex=0;
        int lastIndex=arr.length-1;
        while(startIndex<lastIndex)
        {
            temp = arr[startIndex];
            arr[startIndex] = arr[lastIndex];
            arr[lastIndex] = temp;
            startIndex++;
            lastIndex--;
        }
        return arr;
    }
}
