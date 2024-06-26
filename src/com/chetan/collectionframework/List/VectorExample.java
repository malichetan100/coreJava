package com.chetan.collectionframework.List;

import javax.xml.crypto.dsig.keyinfo.KeyInfo;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> vector=new Vector<>();
        vector.add("Chetan");
        vector.add("Salim");
        vector.add("Shreyes");
        vector.add("Subbu");
        vector.add("Krishna");
        System.out.println(vector);
        vector.remove(4);
        vector.remove("Salim");
        System.out.println(vector);
        System.out.println("==========================");
        System.out.println(vector.isEmpty());

    }
}
