package com.alphajava;

// https://leetcode.com/problems/peak-index-in-a-mountain-array/
// peek element in mountain array
// mountain array is arrray containing ascendind and descending sorted arrays

public class mountainarraybinarysearch {
    public static void main(String[] args){

    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while (start < end) {
            /* int mid=(start+end)/2; */    // this might excced the value of int capacity resulting error
            int mid = start + (end - start) / 2;
            if (arr[mid]>arr[mid+1]) {   // you are in decreasing part of array this is a potential answer
                end = mid;           // so checking the next part this is why end is not mid -1
            }
            else  {
                start = mid + 1;    // we know that next element is greater than previous
            }
        }
        // in the end of while loop  start and end will point to largest element in the array
        return start;
    }

    //  https://leetcode.com/problems/find-in-mountain-array/
    //  serach in mountaun array

    public static   int orderdiagBS(int[] arr, int target,int start,int end) {

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            /* int mid=(start+end)/2; */    // this might excced the value of int capacity resulting error
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                // ans found
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }
    public static int search(int[] arr,int target){
        int peak=peakIndexInMountainArray(arr);
        int firstry=orderdiagBS(arr,target,0,peak);
        if (firstry!=-1){
            return firstry;
        }
        return orderdiagBS(arr,target,peak+1,arr.length-1);
    }
}

