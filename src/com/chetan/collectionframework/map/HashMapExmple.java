package com.chetan.collectionframework.map;

import java.util.HashMap;

public class HashMapExmple {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap=new HashMap<>();

        hashMap.put(null,null);
        hashMap.put(123,"Chetan");
        hashMap.put(456,"Kiran");
        hashMap.put(789,"Deepak");

        System.out.println(hashMap);

        System.out.println(hashMap.get(456));

        hashMap.remove(null);
        System.out.println(hashMap);

        //returns in set view
        System.out.println(hashMap.entrySet());

        System.out.println(hashMap.containsKey(789));
        System.out.println(hashMap.containsKey(5555));

        System.out.println(hashMap.containsValue("Kiran"));
        System.out.println(hashMap.containsValue("kkkkk"));

        System.out.println(hashMap.isEmpty());

        hashMap.clear();
        System.out.println(hashMap.isEmpty());

    }
}
