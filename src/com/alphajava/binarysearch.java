package com.alphajava;

public class binarysearch {

    public static void main(String[] args) {
        int[] arr = {-5, -3, 0, 2, 4, 9, 17, 25, 29, 35, 48, 84};
        int target = 25;


        int ans = binarysearch(arr, target);
        System.out.println(ans);
        int[] arr1 = {89, 45, 41, 36, 32, 25, 20, 19, 10, 4, 1, 0, -2, -4, -6};
        int ans1 = orderdiagBS(arr1, target);
        System.out.println(ans1);
        int[] arr2 = {-5, -3, 0, 2, 4, 9, 17, 27, 29, 35, 48, 84};
        int target2 = 25;
        int ans3 = findnum(arr2, target2);
        System.out.println(ans3);
        int ans4 = findnum2(arr2, target2);
        System.out.println(ans4);

    }

    public static int binarysearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

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

    public static int orderdiagBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

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

    /* find the number equal to target or find the samllest number in array which is greater than target  */

    public static int findnum(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            /* int mid=(start+end)/2; */    // this might excced the value of int capacity resulting error
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return arr[mid];
            }
        }
        return arr[start];
    }
    /* find the number equal to target or find the greatest number in array which is smaller than target  */

    public static int findnum2(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            /* int mid=(start+end)/2; */    // this might excced the value of int capacity resulting error
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return arr[mid];
            }
        }
        return arr[end];
    }

    /* https://leetcode.com/problems/find-smallest-letter-greater-than-target/#:~:text=Given%20a%20characters%20array%20letters,the%20answer%20is%20'a'%20.  */
    /*   return smallest char greater than target  */
    public static char findchar(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            /* int mid=(start+end)/2; */    // this might excced the value of int capacity resulting error
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return arr[start % arr.length]; // it is simmilar to if condition if start == arr.length return arr[o]
    }

    // https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
    // find first and last position of element in sorted array leetcode question
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        int start = search(nums, target, true); // for 1st occurence truth value is true.

        int end = search(nums, target, false); // for last occurence truth value is false.

        ans[0] = start;
        ans[1] = end;

        return ans;
    }

    int search(int[] nums, int target, boolean startindex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            /* int mid=(start+end)/2; */    // this might excced the value of int capacity resulting error
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                //potential  ans found
                ans = mid;

                if (startindex == true) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }




}

