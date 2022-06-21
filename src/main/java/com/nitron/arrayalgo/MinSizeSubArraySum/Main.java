package com.nitron.arrayalgo.MinSizeSubArraySum;

public class Main {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        int sum = 15;

        System.out.println(new MinSizeSubArraySumCalc().calcMinSubArraySum(arr, sum));

    }

}
