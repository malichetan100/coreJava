package com.chetan;
import java.util.Arrays;

public class MainDummy {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        //char[] atr1=Arrays.sort(arr1);
        System.out.println("=====================");
        //System.out.println(Arrays.sort(arr1));
        Arrays.sort(arr2);
        System.out.println("=====================");
     //   System.out.println(Arrays.sort(arr1));
         Arrays.equals(arr1, arr2);
    }
//C:\Users\HP\IdeaProjects\Java_Programs\src\com\chetan\MainDummy.javaC:\Users\HP\IdeaProjects\Java_Programs
}

