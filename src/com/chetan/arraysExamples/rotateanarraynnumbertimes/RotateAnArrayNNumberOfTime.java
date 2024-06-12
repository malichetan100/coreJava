package com.chetan.arraysExamples.rotateanarraynnumbertimes;

public class RotateAnArrayNNumberOfTime {

    public int[] rotateAnArray(int[] arr,int numberOfTimes)
    {
        for(int i=0; i < numberOfTimes;i++)
        {
            RotateAnArrayNNumberOfTime.reverseArray(arr,i,arr.length-1);
        }
        return arr;
    }

    public static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

//    public static int[] reverseArray(int []arr)
//    {
//        int temp=0;
//        int startIndex=0;
//        int lastIndex=arr.length-1;
//        while(startIndex<lastIndex)
//        {
//            temp = arr[startIndex];
//            arr[startIndex] = arr[lastIndex];
//            arr[lastIndex] = temp;
//            startIndex++;
//            lastIndex--;
//        }
//        return arr;
//    }
    }
}
