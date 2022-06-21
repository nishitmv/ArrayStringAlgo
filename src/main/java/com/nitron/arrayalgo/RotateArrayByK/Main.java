package com.nitron.arrayalgo.RotateArrayByK;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2};
        int k = 3;
        new ArrayRotator().rotate(arr, k);

        for(int x: arr)
            System.out.println(x+" ");
    }

}
