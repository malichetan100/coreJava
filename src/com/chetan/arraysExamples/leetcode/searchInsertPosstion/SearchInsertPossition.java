package com.chetan.arraysExamples.leetcode.searchInsertPosstion;

public class SearchInsertPossition {
    public int searchInsert(int[] nums, int target) {
        int size=nums.length;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==target){
                return i;
            }
            else {
                for(int j=size;j>0;j--)
               {
                    if(nums[i]<=target)
                    {
                        nums[i-1]=target;
                        return i-1;

                    }
                    else
                    {
                        nums[i+1]=target;
                        return i+1;
                    }
                }
            }

        }
        return 0;
    }
}
