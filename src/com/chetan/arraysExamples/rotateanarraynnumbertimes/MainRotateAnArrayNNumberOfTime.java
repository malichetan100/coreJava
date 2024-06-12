package com.chetan.arraysExamples.rotateanarraynnumbertimes;

import java.util.Arrays;

public class MainRotateAnArrayNNumberOfTime {
    public static void main(String[] args) {
        int []arr={1, 2, 3, 4, 5};
        int number =3;
        RotateAnArrayNNumberOfTime rotateAnArrayNNumberOfTime=new RotateAnArrayNNumberOfTime();
        int [] res=rotateAnArrayNNumberOfTime.rotateAnArray(arr, number);
        System.out.println(Arrays.toString(res));
    }
}
