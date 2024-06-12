package com.chetan.dsa;

public class BinarySearch {
    int mid;
    public int getIndex(int arr[], int low, int high,int key)
    {
        while(low<=high)
        {
            mid=(high+low)/2;

            if(key==arr[mid])
            {
                return mid;
            }
            else if(key>arr[mid])
            {
                low=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return -1;
    }
}
