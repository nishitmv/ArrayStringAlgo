package com.nitron.arrayalgo.RotateArrayByK;

public class ArrayRotator {

    public void rotate(int[] nums, int k) {

        if(nums.length==1)
            return;

        k = k% nums.length;

        int n = nums.length;
        int[] temp = new int[n];
        for(int i=0;i<n-k;i++)
        {
            temp[i]= nums[i];
        }
        int j=0;
        for(int i=n-k;i<n;i++)
        {
            nums[j] = nums[i];
            j++;
        }
        j=0;
        for( int i= k; i<n;i++)
        {
            nums[i] = temp[j];
            j++;
        }

    }
}
