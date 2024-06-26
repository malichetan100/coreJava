package com.chetan.collectionframework.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> names = new PriorityQueue<>();
        names.add("Chetan");
        names.add("Kiran");
        System.out.println(names);
        names.add("Shridhar");
        System.out.println(names);
        names.remove();
        System.out.println(names);
        names.add("Salim");
        System.out.println(names);
        System.out.println(names.peek());
        System.out.println(names.poll());
        System.out.println(names);
    }
}
