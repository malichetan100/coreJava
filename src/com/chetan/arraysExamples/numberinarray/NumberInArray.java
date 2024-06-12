package com.chetan.arraysExamples.numberinarray;

public class NumberInArray {
    public  boolean isNumberInArray(int[] arr, int target) {
            for(int i=0;i< arr.length;i++)
            {
                if(target==arr[i])
                {
                    return true;
                }

            }
        return false;
    }
}
