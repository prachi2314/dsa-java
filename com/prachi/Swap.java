package com.prachi;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
       int [] arr = {1, 3, 23, 9, 18};
       reverse(arr);
       System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr){
        int start =0;
        int end = arr.length-1;
        while (start<end) {
            // reverse(arr,start, end);
            start++;
            end--;
        }
    }
}
