package com.chetan.exceptionhandling;

public class ArrayIndexOutOfBondExceptionExample {
    public static void main(String[] args) {
        int[] arr=new int[5];

        for(int i=0;i< arr.length;i++)
        {

            try{
                System.out.println(arr[i]);
            }
            catch (ArrayIndexOutOfBoundsException ex){
                System.out.println(ex);
            }
        }

        try{
            System.out.println(arr[6]);
        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println(ex);
        }
    }
}
