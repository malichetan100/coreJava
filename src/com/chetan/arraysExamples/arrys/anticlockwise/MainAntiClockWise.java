package com.chetan.arraysExamples.arrys.anticlockwise;

import java.util.Arrays;

public class MainAntiClockWise {
    public static void main(String[] args) {
        int[][] twoDMatrix = {{1,2,3},{4,5,6},{7,8,9}};
        int sizeArray = (twoDMatrix.length)*(twoDMatrix.length);
        System.out.println(sizeArray);

        int[] newArray= new int[sizeArray];
        System.out.println("Original matrxi");
        System.out.println(Arrays.deepToString(twoDMatrix));
        AntiClockWiseRotation antiClockWiseRotation = new AntiClockWiseRotation();

        twoDMatrix = antiClockWiseRotation.rotateAnticlockWise(twoDMatrix);
        System.out.println("Matrix after anticlock wise rotation");
        System.out.println(Arrays.deepToString(twoDMatrix));

    }
}
