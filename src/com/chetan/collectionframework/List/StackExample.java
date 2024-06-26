package com.chetan.collectionframework.List;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> marks=new Stack<>();
        marks.push(20);
        marks.push(30);
        System.out.println(marks);
        marks.add(1,50);
        System.out.println(marks);

        marks.pop();
        System.out.println(marks);
        marks.push(30);
        System.out.println(marks);

    }
}
