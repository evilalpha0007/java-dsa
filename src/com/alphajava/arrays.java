package com.alphajava;

import java.util.*;
public class arrays {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array you want");
        int size= sc.nextInt();
        int array[]=new int[size];

        for(int i=0;i<size;i++){
            array[i]= sc.nextInt();
        }
        System.out.println(" enter the number you want to find ");
        int check= sc.nextInt();
        for (int i=0;i<size;i++){
            if(array[i]==check){
                System.out.println(" the number found at"+" "+i);
            }

        }
    }
}
