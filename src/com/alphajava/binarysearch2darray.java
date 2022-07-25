package com.alphajava;

import java.util.Arrays;

public class binarysearch2darray {

    public static int[] Search(int[][] matrix, int target) {   //here only rows are sorted in given matrix
        int r = 0;
        int c = matrix.length - 1;

        while (r < matrix.length && c >= 0) {
            if (matrix[r][c] == target) {
                return new int[]{r, c};
            }
            else if(matrix[r][c]>target){
                c--;
            }
            else {
                r++;
            }
        }
        return new int[] {-1,-1};
    }
    public static void main(String[] args) {
        int [][]arr={
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}

        };
        System.out.println(Arrays.toString(Search(arr,23)));
    }


}
