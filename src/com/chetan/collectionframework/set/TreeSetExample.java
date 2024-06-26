package com.chetan.collectionframework.set;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet=new TreeSet<>();

        treeSet.add(23);
        treeSet.add(78);
        treeSet.add(23);
        treeSet.add(25);
        treeSet.add(85);
        treeSet.add(45);
        treeSet.add(98);
        treeSet.add(0);
        System.out.println(treeSet);

        System.out.println(treeSet.size());
        treeSet.remove(23);
        treeSet.remove(98);
        System.out.println(treeSet);

        System.out.println(treeSet.contains(78));
        System.out.println(treeSet.size());

        System.out.println(treeSet.isEmpty());

        treeSet.clear();
        System.out.println(treeSet.isEmpty());

    }
}
