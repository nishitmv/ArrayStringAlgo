package com.nitron.arrayalgo.ReverseElementsOfArray;

import java.util.Arrays;

public class ReverseArrayElements {

        public static void main(String[] args) {

                int[] arr = {3,4,5,6,7,8,9};
               // new ReverseArrayElements().reverse(arr, arr.length);
                char[] arr1 = {'h','e','l','l','o'};
                new ReverseArrayElements().reverseString(arr1);
                for(int i=0;i< arr1.length;i++)
                        System.out.println(arr1[i]);
               

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

        public void reverseString(char[] arr)
        {
                int i=0;
                int j = arr.length-1;

                while(j>i)
                {
                        char temp =   arr[i];
                        arr[i] = arr[j];
                        arr[j]=temp;
                        i++;j--;
                }

        }

}
