package com.chetan.collectionframework.set;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> hashSet=new HashSet<>();
        hashSet.add("Chetan");
        hashSet.add("Kiran");
        hashSet.add("Deepak");
        hashSet.add("Puneet");
        hashSet.add("Krishna");
        hashSet.add("Shridhar");
        hashSet.add("Nnn");
        hashSet.add(null);
        System.out.println(hashSet);

        System.out.println(hashSet.size());
        hashSet.remove("Nnn");
        hashSet.remove(null);
        System.out.println(hashSet);

        System.out.println(hashSet.contains("Nnnn"));
        System.out.println(hashSet.size());

        System.out.println(hashSet.isEmpty());

        hashSet.clear();
        System.out.println(hashSet.isEmpty());

    }
}
