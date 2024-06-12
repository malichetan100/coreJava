package com.chetan.operators;

public class ShiftOperators2 {
    public static void main(String args[]) {
        int number1 = 2;
        int number2 = 2048;
        for (int i = 0; i <= 10; i++) {
            System.out.println("Left Shift: " + i + "=" + (number1 << i));
            System.out.println("Right Shift: " + i + "=" + (number2 >> i));
        }
    }
}
