package com.prachi;

public class linearsearch {
    public static void main(String[] args) {
        int[] nums = {23, 1, 56, 42, 25, 65, 52};
        int target = 412;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        for(int i = 0; i<arr.length; i++){
            int element = arr[i];
            if(element==target){
                return i;
            }
        }
        return -1;
    }
}
