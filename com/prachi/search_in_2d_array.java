package com.prachi;

import java.util.Arrays;

public class search_in_2d_array {
    public static void main(String[] args) {
        int[][] arr = {
            {23, 4, 1},
            {21, 54, 35},
            {45, 65, 52},
            {24, 59}
        };
        int target = 35;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
