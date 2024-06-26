package com.chetan.Interviewquestions;

import java.util.Arrays;

public class DetectCapital {
    public static void main(String[] args) {
        String[] s = {"h","e","l","l","o"};
        String[] ss=new String[s.length];
        for(int i=0;i<=s.length-1;i++)
        {
            ss[s.length-1]=s[i];
        }
        System.out.println(Arrays.toString(ss));
    }
}


