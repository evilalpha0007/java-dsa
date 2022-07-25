package com.alphajava;

public class recursion2 {
    /* public static void towerofhanoi(int n,String src,String hel, String des){
        if(n==1){
            System.out.println("Transfering disk "+n+" from "+src+" to "+ des );
            return;
        }
        towerofhanoi(n-1,src,des,hel);
        System.out.println("Transfering disk "+n+" from "+src+" to "+des);
        towerofhanoi(n-1,hel,src,des);
    }*/
    /* public static void printrev(String str, int idx){
        if(idx==0){
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        printrev(str,idx-1);
    }
    */
    public static int first=-1;
    public static int last=-1;

    public static void charoccur(String str,int idx,char element){
        if(idx==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currentchar=str.charAt(idx);
        if (currentchar==element){
            if(first==-1){
                first=idx;
            }
            else {
                last=idx;
            }
        }
        charoccur(str,idx+1,element);
    }
    public static boolean checkSort(int[] arr,int idx ){
        if(idx== arr.length-1){
            return true;
        }
             if (arr[idx]<arr[idx+1]){          // array is sorted till now
                     return checkSort(arr,idx+1);
                 }
            else {
                    return false;
                 }
    }
    public static void moveAllX(String str, int idx, int count, String newstr) {
        if(idx==str.length()){
            for (int i=0;i<=count;i++){
                newstr=newstr+'x';
            }
            System.out.println(newstr);
            return;
        }
       char currentchar=str.charAt(idx);
       if(currentchar=='x'){
           count++;
           moveAllX(str,idx+1,count,newstr);
       }
       else {
           newstr+=currentchar;
           moveAllX(str,idx+1,count,newstr);
       }
    }
    public static boolean[] map=new boolean[26];
    public static void removeduplicate(String str,int idx,String newstr){
        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }
        /* in ascii values when we subtract any character by a we get it position-1  for ex: a-a=0 a occurs first
        * similarly b-a=1 b occurs at 2nd in english  */

        char currentchar=str.charAt(idx);
        if(map[currentchar-'a'] == true){
            removeduplicate(str,idx+1,newstr);
        }
        else {
            newstr+=currentchar;
            map[currentchar-'a'] = true;
            removeduplicate(str,idx+1,newstr);
        }
    }
    public static void subseq(String str,int idx,String newstr){
        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }
        char currentchar=str.charAt(idx);

        //to be
        subseq(str,idx+1,newstr+currentchar);

        //not to be
        subseq(str,idx+1,newstr);
    }
    public static void main(String[] args){
    /*    int n=3;
        int[] arr={1,2,3,4,5};
        towerofhanoi(n,"S","H","D");*/
        String str1="abc";
        /*int idx=str.length()-1;*/

        /*printrev(str,idx);*/
       /* charoccur(str1,0,'a');*/
       /* System.out.println(checkSort(arr,0));*/
        /*moveAllX(str1,0,0,"");*/
        /*removeduplicate(str1,0,"");*/
        subseq(str1,0,"");
    }
}
