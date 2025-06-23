package com.prachi;

public class recursion {
    public static void main(String[] args) {
        int ans = fibo(4);
        System.out.println(ans);

        int[] arr = {1, 3, 5, 6, 12, 45, 50, 66, 68};
        int target = 45;
        System.out.println(search(arr, target, 0, arr.length-1));
    }

    static int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }

    static int search(int[] arr, int target, int s, int e){
        if(s>e){
            return -1;
        }

        int m = s + (e-s)/2;

        if(arr[m] == target){
            return m;
        }
        if (target < arr[m]) {
           return search(arr, target, s, m-1);
        }else{
            return search(arr, target, m+1, e);
        }
    }
}
