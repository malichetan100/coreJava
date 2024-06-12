package com.chetan.arraysExamples.sumofdiagonalelements;

public class SumOfDiagonalElements {

    public int calculateSumOfDiagonalElements(int arr[][])
    {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
        }
        return sum;
    }
}
