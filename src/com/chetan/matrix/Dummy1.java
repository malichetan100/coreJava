package com.chetan.matrix;

public class Dummy1 {

    public static boolean detectCapitalUse(String word) {
        if(word.equals(word.toUpperCase()))
        {
            return true;
        }
        return false;

    }
    public static void main(String[] args) {
        String word="Usa";

      boolean res=Dummy1.detectCapitalUse(word);
        System.out.println(res);
    }

}
