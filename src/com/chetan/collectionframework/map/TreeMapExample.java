package com.chetan.collectionframework.map;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap=new TreeMap<>();

        treeMap.put(123,"Chetan");
        treeMap.put(456,"kiran");
        treeMap.put(789,"Krishna");
        treeMap.put(987,"Subbu");
        treeMap.put(000,null);

        System.out.println(treeMap);

        treeMap.remove(000);
        System.out.println(treeMap);

        System.out.println(treeMap.values());
        System.out.println(treeMap.keySet());
        System.out.println(treeMap.isEmpty());

        System.out.println(treeMap.size());
    }
}
