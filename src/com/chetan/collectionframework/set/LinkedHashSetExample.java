package com.chetan.collectionframework.set;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet=new LinkedHashSet<>();

        linkedHashSet.add("Chetan");
        linkedHashSet.add("Kiran");
        linkedHashSet.add("Deepak");
        linkedHashSet.add("Puneet");
        linkedHashSet.add("Krishna");
        linkedHashSet.add("Shridhar");
        linkedHashSet.add("Nnn");
        linkedHashSet.add(null);
        System.out.println(linkedHashSet);

        System.out.println(linkedHashSet.size());
        linkedHashSet.remove("Nnn");
        linkedHashSet.remove(null);
        System.out.println(linkedHashSet);

        System.out.println(linkedHashSet.contains("Nnnn"));
        System.out.println(linkedHashSet.size());

        System.out.println(linkedHashSet.isEmpty());

        linkedHashSet.clear();
        System.out.println(linkedHashSet.isEmpty());
    }
}
