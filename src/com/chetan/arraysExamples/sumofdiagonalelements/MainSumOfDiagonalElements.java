package com.chetan.arraysExamples.sumofdiagonalelements;

import java.util.Scanner;

public class MainSumOfDiagonalElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SumOfDiagonalElements sumOfDiagonalElements = new SumOfDiagonalElements();
        int row, col;
        System.out.println("Enter the row of an array");
        row = scanner.nextInt();

        System.out.println("Enter the col of an array");
        col = scanner.nextInt();
        int[][] userarray1 = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Enter the size of an array" + i + " " + j);
                userarray1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("The entered 2D array is: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(userarray1[i][j] + " ");
            }
        }
        System.out.println();
        int result=sumOfDiagonalElements.calculateSumOfDiagonalElements(userarray1);
        System.out.println("The sum of sumOfDiagonal Elements is: "+result);
    }
}
