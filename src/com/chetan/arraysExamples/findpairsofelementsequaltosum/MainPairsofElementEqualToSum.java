package com.chetan.arraysExamples.findpairsofelementsequaltosum;

public class MainPairsofElementEqualToSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 7;
        PairsofElementEqualToSum pairsofElementEqualToSum=new PairsofElementEqualToSum();

       int a[][]= pairsofElementEqualToSum.pairedElements(arr,target);
    }
}
