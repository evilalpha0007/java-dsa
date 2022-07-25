package com.alphajava;

// implementing binary search in infinite array (assuming that having unknown  size)
// amazon question
// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

public class binarysearchinfinitearray {
    public static void main(String[] args){
        int[] arr = { 2, 4, 9, 17, 25, 29, 35, 48, 84};
        int target = 25;
        System.out.println(ans(arr,target));
        }

    public static int infinitebinarysearch(int[] arr, int target ,int start,int end){
        while (start <= end) {
            /* int mid=(start+end)/2; */    // this might excced the value of int capacity resulting error
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }

    public static int ans(int[] arr, int target) {
        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            int temp = end + 1; // its our new start
            end = end + (end - start + 1) * 2;
            start = temp;
        }
       return infinitebinarysearch(arr,target,start,end);

    }
    }

