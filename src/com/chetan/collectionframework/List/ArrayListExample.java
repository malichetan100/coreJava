package com.chetan.collectionframework.List;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();

        arrayList.add("Chetan");
        arrayList.add(20);
        arrayList.add(true);
        arrayList.add(3.142);
        arrayList.add(50);
        System.out.println(arrayList);
        arrayList.remove(1);
        System.out.println(arrayList);

        System.out.println("==========================================");
        ArrayList<Integer> arrayList1=new ArrayList<>();
        arrayList1.add(20);
        arrayList1.add(30);
        arrayList1.add(50);
        arrayList1.add(10);
        System.out.println(arrayList1);

        arrayList1.remove(2);
        System.out.println(arrayList1);

        System.out.println(arrayList1.contains(20));
        System.out.println(arrayList1.getFirst());
        System.out.println(arrayList1.getLast());
        System.out.println(arrayList1.isEmpty());
        System.out.println(arrayList1.size());
      //  arrayList1.clear();  //its return
        System.out.println(arrayList1.removeAll(arrayList1)); //its return type is boolean
        System.out.println(arrayList1);
        System.out.println(arrayList1.isEmpty());


    }
}
