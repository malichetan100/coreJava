package com.chetan.matrix;

import java.util.Arrays;
import java.util.Scanner;

public class dummy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // int arr[]={1,2,3};
        int twoDArr[][] = {{1, 2}, {1, 2}};
        int size;
        System.out.println("Enter the size of an array");
        size = scanner.nextInt();
        int[] userarray = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the size of an array" + i);
            userarray[i] = scanner.nextInt();
        }

        for (int i = 0; i < userarray.length; i++) {
            System.out.print(userarray[i] + " ");
            System.out.println();
        }


        int row, col;
        System.out.println("Enter the row of an array");
        row = scanner.nextInt();

        System.out.println("Enter the col of an array");
        col = scanner.nextInt();
        int[][] userarray1 = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Enter the size of an array" + i);
                userarray1[i][j] = scanner.nextInt();
            }

        }

        System.out.println("The entered 2D array is:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(userarray1[i][j]+ " ");
                System.out.println();
            }

        }
        System.out.println(Arrays.deepToString(userarray1));

    }
}
