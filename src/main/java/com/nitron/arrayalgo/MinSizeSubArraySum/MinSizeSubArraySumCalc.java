package com.nitron.arrayalgo.MinSizeSubArraySum;

public class MinSizeSubArraySumCalc {

    public int calcMinSubArraySum(int[] arr, int sum) {
        if (arr.length == 0)
            return 0;
        int k = 0;
        int tempSum = 0;
        int size = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++ ) {
            tempSum+=arr[i];
            while(tempSum>=sum)
            {
                size = Math.min(size, i - k + 1);
                tempSum -= arr[k];
                k++;
            }
        }
        return size;
    }

}
