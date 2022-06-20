package com.nitron.arrayalgo.ReverseElementsOfArray;

public class ReverseArrayElements {

        public static void main(String[] args) {

                int[] arr = {3,4,5,6,7,8,9};
                new ReverseArrayElements().reverse(arr, arr.length);

                for(int i=0;i< arr.length;i++)
                        System.out.println(arr[i]);

        }

        public void reverse(int[] arr, int n)
        {
                int i=0;
                int j = n-1;

                while(j>i)
                {
                      int temp =   arr[i];
                      arr[i] = arr[j];
                      arr[j]=temp;
                      i++;j--;
                }

        }

}
