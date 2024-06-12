package com.chetan.arraysExamples.findmissingnumberinarray;

public class MissingNumberInArray {

    public int findMissingNumberInArray(int[] arr)
    {
        int n = arr.length + 1;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
}
