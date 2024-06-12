package com.chetan.arraysExamples.numberofcoins;

public class NumberOfCoinsInRupees {
    int numberOfNotes;
    public int getNumberOfnotes(int[]arr,int amount){
        int minNoOfNotes = 0;
        int result;

        for (int i = arr.length - 1; i >= 0; i--) {

            if (amount > 0) {
                result = amount / arr[i];
                if (result > 0) {
                    minNoOfNotes += result;
                    amount -= result * arr[i];
                    System.out.println(arr [i]+"--> "+result);
                }
            }

        }
        return minNoOfNotes;
    }

}
