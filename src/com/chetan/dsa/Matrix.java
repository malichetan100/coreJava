package com.chetan.dsa;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter an first size of: ");
        int size1=scanner.nextInt();
        System.out.println("Enter an second size of: ");
        int size2=scanner.nextInt();
        int arr[] []=new int[size1][size2];
        int i,j;
        for (i = 0; i < size1; i++)
        {
            for(j=0;j<size2;j++)
            {
                System.out.println("Enter 1st" + (i + 1) + " value");
                arr[i][j] = scanner.nextInt();
                System.out.println("Enter 2nd" + (j + 1) + " value");

                arr[i][j] = scanner.nextInt();
            }
            System.out.println(arr[i][j]);
        }


    }
}
