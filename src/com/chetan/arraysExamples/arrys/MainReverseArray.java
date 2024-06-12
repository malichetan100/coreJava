package com.chetan.arraysExamples.arrys;

import java.util.Arrays;

public class MainReverseArray {
    public static void main(String[] args) {
        int myArray[]={1,2,3};
       // int size=3;
        ReverseArray reverseArray=new ReverseArray();
        System.out.println(Arrays.toString(reverseArray.reverseArray(myArray)));
    }
}
