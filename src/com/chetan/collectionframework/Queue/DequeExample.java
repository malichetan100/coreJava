package com.chetan.collectionframework.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {
        Deque<Double> deque=new ArrayDeque<>();
        deque.add(21.22);
        deque.add(55.66);
        deque.add(76.25);
        deque.add(66.321);
        System.out.println(deque);

        System.out.println(deque.peek());
        System.out.println(deque.poll());
        System.out.println(deque);

        deque.remove();
        deque.remove();
        System.out.println(deque);
        deque.add(21.22);
        deque.add(55.66);
        System.out.println(deque);

    }
}
