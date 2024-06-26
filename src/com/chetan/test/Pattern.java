package com.chetan.test;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        int k=0;
        char[] c={'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L',
                'M', 'N', 'O', 'P', 'Q', 'R',  'S', 'T', 'U', 'V', 'W', 'X',
                'Y', 'Z'};

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter an number: ");
        int number=scanner.nextInt();

        for(int i=0;i<number;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(c[k]+" ");
                k++;
            }
            System.out.println();
        }

    }
}
