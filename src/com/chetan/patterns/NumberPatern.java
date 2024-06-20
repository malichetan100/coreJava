package com.chetan.patterns;

import java.util.Scanner;

public class NumberPatern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an number");
        int number = scanner.nextInt();
        int c = 1;
        for (int i = 1; i <= number; i++) {
            for (int j = number; j >= i; j--) {  //for (int j = 1; j <= i; j++) {
                //System.out.print(j + " ");
                System.out.print(c + " ");
                c++;
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------");
        System.out.println();
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------");
        System.out.println();

        for (int i = 1; i <= number; i++) {
            for (int j = number; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

}