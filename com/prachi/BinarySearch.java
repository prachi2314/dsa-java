package com.prachi;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {6, 11, 15, 20, 23, 29, 31, 45};
        int target = 14;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    // return index
    // return -1 if doesn't exist
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end =  arr.length-1;
        while(start<=end){
            //  int mid = (start+end)/2;
            int mid = start + (end-start)/2;

            if(target < arr[mid]){
                end = mid-1;
            }
            else if(target > arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
