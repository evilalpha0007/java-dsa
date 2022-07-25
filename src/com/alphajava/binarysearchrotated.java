package com.alphajava;

public class binarysearchrotated {
    public static void main(String[] args){
        int[] arr={4,5,6,7,0,1,2,3};
        int ans= findpivot(arr);
        System.out.println(ans);
        int ans1=search(arr,2);
        System.out.println(ans1);

    }
    public static int findpivot(int[] arr){ // note for duplicate values it will not work
        int start=0;                        //because lat 2 condition will fail
        int end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            // 4 cases here
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]<=arr[start]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static int binarysearch(int[] arr, int target,int start,int end) {

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
    public static int search(int[] nums, int target) {
        int pivot=findpivot(nums);
        // if pivot is not found then the array is not rotated
        // so just perform normal  binary search

        if(pivot==-1){
         return    binarysearch(nums,target,0,nums.length-1);
        }
        // if pivot is found you have two sorted arrays and then perform binary search
        if(nums[pivot]==target){
            return pivot;
        }
        if(target>=nums[0]){
          return   binarysearch(nums,target,0,pivot-1);
        }
       return binarysearch(nums,target,pivot+1,nums.length-1);
    }

    public static int findpivotwithduplicates(int[] arr) { // note for duplicate values it will not work
        int start = 0;                        //because lat 2 condition will fail
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
           if(arr[mid]==arr[start] && arr[mid]==arr[end] ){
               if (arr[start]>arr[start+1]){
                   return start;
               }
               start++;
               if (arr[end]<arr[end-1]){
                   return end-1;
               }
               end--;
               if(arr[start]<arr[mid] || arr[start]==arr[mid] && arr[mid]>arr[end]){
                   start=mid+1;
               }else{
                   end=mid-1;
               }
           }
        }
        return -1;
    }
    // to print how many times is the array rotated

    public static int countrotations(int[] arr){
        int piovot=findpivot(arr);
            return piovot+1;
    }
}
