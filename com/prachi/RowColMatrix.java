package com.prachi;

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] arr = {
            {2, 12, 35, 46},
            {5, 16, 36, 48},
            {10, 20, 41, 59},
            {11, 25, 43, 62}
        };
        int target = 62;
        System.out.println(Arrays.toString(search(arr, target)));
    }

    static int[] search(int[][] matrix, int target){
        int r = 0;
        int c = matrix.length-1;

        while (r<matrix.length && c>=0) {
            if (matrix[r][c] == target) {
                return new int[] {r,c};
            }
            else if (matrix[r][c]<target) {
                r++;
            } else {
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}
