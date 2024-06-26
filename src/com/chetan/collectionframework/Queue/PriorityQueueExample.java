package com.chetan.collectionframework.Queue;

import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>();
        priorityQueue.add(20);
        priorityQueue.add(20);
        priorityQueue.add(70);
        priorityQueue.add(80);
        priorityQueue.add(40);
        priorityQueue.add(90);
        System.out.println(priorityQueue);

        priorityQueue.remove();
        priorityQueue.remove();
        System.out.println(priorityQueue);
        System.out.println("==================");
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue);
    }
}
