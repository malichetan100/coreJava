package com.chetan.collectionframework.List;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> linkedList=new LinkedList<>();
        linkedList.add("Chetan");
        linkedList.add("Kiran");
        linkedList.add("Salim");
        linkedList.add("Krishna");
        linkedList.add("Shreyes");
        linkedList.add("Subbu");

        System.out.println(linkedList);
        System.out.println(linkedList.get(3));
        System.out.println(linkedList.contains("Chetan"));
        System.out.println(linkedList.contains("aegiesnural"));
        linkedList.pop();
        System.out.println(linkedList);

        linkedList.addFirst("Chetan");
        System.out.println(linkedList);

        linkedList.addLast("laptop");
        System.out.println(linkedList);

        linkedList.offer("krish"); //add the element in the last
        System.out.println(linkedList);

        System.out.println(linkedList.element()); //it will return head element but not removes it.





    }
}
