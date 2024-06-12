package com.chetan.arraysExamples.arrys.clcokwise;

import java.util.Arrays;

public class MainClockWiseRotation {
    public static void main(String[] args) {
        int[][] twoDMatrix = {{1,2,3},{4,5,6},{7,8,9}};
        int sizeArray = (twoDMatrix.length)*(twoDMatrix.length);
        System.out.println(sizeArray);

        ClockWiseRotation clockWiseRotation = new ClockWiseRotation();
        twoDMatrix= clockWiseRotation.performClockWiseRotation(twoDMatrix);
        System.out.println("Matrix after clock wise rotation");
        System.out.println(Arrays.deepToString(twoDMatrix));


        int[] newArray= new int[sizeArray];
        int k = 0;
        for(int i=0;i<twoDMatrix.length;i++){
            for(int j=0;j<twoDMatrix.length;j++){
                newArray[k]=twoDMatrix[i][j];
                k++;
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}
