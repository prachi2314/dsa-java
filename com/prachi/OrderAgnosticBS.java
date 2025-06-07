package com.prachi;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr ={65, 60, 58, 53, 44, 42, 35, 15, 6};
        int target = 35;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        boolean isAsc = arr[start]<arr[end];
        

        while (start<=end) {
            int mid = start + (end-start)/2;

            if(arr[mid] == target){
                return mid;
            }

            if (isAsc) {
                if (target<arr[mid]) {
                end = mid-1;
                }
                else{
                start = mid+1;
                } 
            }
            else {
                if (target>arr[mid]) {
                end = mid-1;
                }
                else{
                start = mid+1;
                } 
            }
        }
        return -1;

    }
}
