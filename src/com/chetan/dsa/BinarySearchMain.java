package com.chetan.dsa;

import java.util.Scanner;

public class BinarySearchMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinarySearch binarySearch = new BinarySearch();
        System.out.println("Enter an size of an array: ");
        int size = scanner.nextInt();
        int low=0;
        int[] arr=new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter " + (i + 1) + " value");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter an number to be search");
        int key=scanner.nextInt();
        int position = binarySearch.getIndex(arr,low,arr.length,key);

        if(position==-1)
        {
            System.out.println("Element is not found");
        }
        else {
            System.out.println("Element is found at "+(position+1)+" position");
        }

    }
}
