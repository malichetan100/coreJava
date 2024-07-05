package com.chetan.lamdaexpression;

import java.util.Scanner;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class MainClass {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter an first number");
        int number1=scanner.nextInt();

        System.out.println("Enter an second number");
        int number2=scanner.nextInt();

        BiConsumer biConsumer=(a1,a2)->
        {
            System.out.println("The Enter 2 numbers are: "+a1+" "+a2);
        };

        biConsumer.accept(number1,number2);

        BiFunction biFunction=(b1,b2)->{
           // System.out.println("The Enter 2 numbers are: "+b1+" "+b2);
            return b1+" "+b2;
        };

        System.out.println(biFunction.apply(number1,number2));
    }
}
