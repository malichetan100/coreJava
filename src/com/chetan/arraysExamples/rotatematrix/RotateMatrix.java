package com.chetan.arraysExamples.rotatematrix;

public class RotateMatrix {

    public int[][] transposeTheMatrix(int arr[][]) {

        int transpose[][] = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                transpose[i][j] = arr[j][i];
            }
        }
        return transpose;
    }

    public int[][] reverseArray(int [][]arr)
    {
        int temp=0;
        int startIndex=0;
        int lastIndex=arr.length-1;
        for(int i=0;i<arr.length;i++) {
            while (startIndex < lastIndex) {
                temp = arr[i][startIndex];
                arr[i][startIndex] = arr[i][lastIndex];
                arr[i][lastIndex] = temp;
                startIndex++;
                lastIndex--;
            }
        }
        return arr;
    }

}
