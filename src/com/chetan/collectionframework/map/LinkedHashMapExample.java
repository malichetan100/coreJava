package com.chetan.collectionframework.map;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> linkedHashMap=new LinkedHashMap<>();

        linkedHashMap.put(123,"Chetan");
        linkedHashMap.put(456,"kiran");
        linkedHashMap.put(789,"Krishna");
        linkedHashMap.put(987,"Subbu");
        linkedHashMap.put(000,null);

        System.out.println(linkedHashMap);

        linkedHashMap.remove(000);
        System.out.println(linkedHashMap);

        System.out.println(linkedHashMap.values());
        System.out.println(linkedHashMap.keySet());
        System.out.println(linkedHashMap.isEmpty());

        System.out.println(linkedHashMap.size());
    }
}
