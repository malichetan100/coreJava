package com.chetan.arraysExamples.rotatematrix;

import java.util.Arrays;

public class MainRotateMatrix {
    public static void main(String[] args) {

        int myArray[][]={{1,2,3},{4,5,6},{7,8,9}};

        RotateMatrix rotateMatrix=new RotateMatrix();
        System.out.println("Before transpose");
        System.out.println(Arrays.deepToString(myArray));
        System.out.println("After transpose");
        System.out.println(Arrays.deepToString(rotateMatrix.transposeTheMatrix(myArray)));

        System.out.println("After rotating anticlockwise");

        System.out.println(Arrays.deepToString(rotateMatrix.reverseArray(myArray)));

    }
}
