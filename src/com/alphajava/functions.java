package com.alphajava;

import java.util.*;

public class functions {
    /*public static void checkPrime(int n) {
        int flag=0;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                flag=1;

            }
        }
        if (flag== 1) {
            System.out.println(" the number is not prime");
        } else {
            System.out.println("the number is  prime");
        }

    }*/
    /*public static void checkEven(int n){
       if(n%2==0){
           System.out.println("the number is even");
       }
       else {
           System.out.println("the number is odd");
       }
    }*/
    public static void printTable(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n*i);
        }
    }
    public static void fibonacci(int n) {

        int n1=0,n2=1,n3;
        System.out.print(n1);
        System.out.print(" ");
        System.out.print(n2+" ");
        for (int i = 2; i <= n; i++) {
            n3=n1+n2;
            System.out.print(n3+" ");
            n1=n2;
            n2=n3;


        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        /*checkPrime(n);*/
       /* checkEven(n);*/
        printTable(n);
    }
}
