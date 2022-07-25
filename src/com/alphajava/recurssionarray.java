package com.alphajava;

import java.awt.*;
import java.util.ArrayList;

public class recurssionarray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] arr1={1,2,2,4,5,5,5,7};
//        System.out.println(sorted(arr, 0));
//        System.out.println(search(arr,64,0));
//        int ans=searchindex(arr,65,0);
//        System.out.println(ans);

//        searchaALLindex(arr1,5,0);
//        System.out.println(list);

        System.out.println(searchaALLindexbycomp(arr1,5,0,new ArrayList<>()));
    }

    public static boolean sorted(int[] arr, int index) {
        if (index == arr.length - 1) {    // base condition
            return true;
        }
        return arr[index] < arr[index + 1] && sorted(arr, index + 1);
    }

    public static boolean search(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || search(arr, target, index + 1);
    }

    public static int searchindex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return searchindex(arr, target, index + 1);
        }
    }

   static ArrayList<Integer> list= new ArrayList<>();
    public static  void searchaALLindex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
          list.add(index);
        }
        searchaALLindex(arr,target,index+1);

    }

    public static  ArrayList searchaALLindexbycomp(int[] arr, int target, int index, ArrayList<Integer> list) { // including arraylist as parameter
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return searchaALLindexbycomp(arr,target,index+1,list);
    }

    // below approach is not optimised as space complexity increases
    public static ArrayList searchaALLindexbycomp2(int[] arr, int target, int index) { // including arraylist as parameter in body
        ArrayList<Integer> list2= new ArrayList<>();
        if (index == arr.length) {
            return list2;
        }
        if (arr[index] == target) { // this will contain answer for that function call only
            list2.add(index);
        }
        ArrayList<Integer> answerbeforecalls= searchaALLindexbycomp2(arr,target,index+1); // every calls answer is stored in this list
        list2.addAll(answerbeforecalls); // adding every answer to a single list
        return list2;
    }
}
