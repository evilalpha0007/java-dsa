package com.alphajava;

import java.util.*;
public class recurrsion3 {
    public static void printsubset(ArrayList<Integer> subset){
        for (int i=0; i<subset.size(); i++){
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }
    public static void subsequence(int n, ArrayList<Integer> subset) {
        if(n==0){
            printsubset(subset);
            return;
        }

        // number is added in collection
        subset.add(n);
        subsequence(n-1,subset);

        // number not added
        subset.remove(subset.size()-1);
        subsequence(n-1,subset);
    }


   /* public static int  callguest(int n){
        if(n<=1){
            return 1;
        }
        // for single way
        int way1 = callguest(n-1);

        // for pair
        int way2 = (n-1) * callguest(n-2);

        return way1 + way2;
    }*/


    /*public static int placetile(int n, int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        // for vertical tile placements
        int verticalplacements=placetile(n-m,m);

        // for vertical tile placements
        int horizontalplacements= placetile(n-1,m);

        return verticalplacements+horizontalplacements;
    }*/


   /* public static int countpath(int i,int j ,int n, int m){
        if(i==n || j==m){
            return 0;
        }
        if(i==n-1 && j==m-1){
            return 1;
        }


        // to move down
        int downpath=countpath(i+1,j,n,m);

        // to move right
        int rightpath=countpath(i,j+1,n,m);

        return downpath+rightpath;
    }
*/


    /*public static void printpermutation(String str,String permutations){
        if(str.length()==0){
            System.out.println(permutations);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currentchar=str.charAt(i);
            String newstr=str.substring(0,i)+str.substring(i+1);
            printpermutation(newstr,permutations+currentchar);
        }
    }*/


    public static void main(String[] args){
        /*  String str="abc";
            printpermutation(str,"");  */

            int n=3; int m=2;

           /* int ans=countpath(0,0,n,m);
            System.out.println(ans);*/

           /* int ans=placetile(n,m);
            System.out.println(ans);*/

            /* int ans= callguest(n);
             System.out.println(ans);*/

            ArrayList<Integer> subset=new ArrayList<>();
            subsequence(n,subset);
    }
}
