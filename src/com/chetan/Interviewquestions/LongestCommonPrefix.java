package com.chetan.Interviewquestions;

public class LongestCommonPrefix {
    public static void main(String[] args) {
       String[] strs = {"flower","flow","flight"};

        String s=strs[1];
        String s1="";
        for(int i=0;i<strs.length;i++)
        {
            for(int j=0;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j))
                {
                    s1=s1+s.charAt(j);
                }
            }
        }
        System.out.println(s1);
    }
}

