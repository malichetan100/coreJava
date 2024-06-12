package com.chetan.arraysExamples.leetcode.searchInsertPosstion;

public class MainSearchInsertPossition {
    public static void main(String[] args) {
       int[]  nums = {1,3,5,6};
       int target = 5;

        int[]  nums1 = {1,3,5,6};
        int target1 = 2;

        int[]  nums2 = {1,3,5,6};
        int target2 = 7;
        SearchInsertPossition searchInsertPossition=new SearchInsertPossition();
       int res1= searchInsertPossition.searchInsert(nums,target);
        System.out.println(res1);
        int res2= searchInsertPossition.searchInsert(nums1,target1);

        System.out.println(res2);
        int res3= searchInsertPossition.searchInsert(nums2,target2);
        System.out.println(res3);
    }
}
