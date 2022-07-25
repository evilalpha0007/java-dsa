package com.alphajava;

import java.util.*;

public class exersize1 {
    /*public static void sumOdd(int n){
        int m=0;
        for(int i=1;i<=n;i++){
            if(n%2!=0){
                m=m+n;
            }
        }
        System.out.println(m);
    }*/
   /* public static void acceptNum(int n){
       int pos=0,neg=0,zero=0;
       if (n>0){
          pos++;
           System.out.println("the number of positive numbers"+pos);
       }
       else if(n<0){
          neg++;
           System.out.println("the number of negative number"+neg);
       }
       else {
           zero++;
           System.out.println("the number of zeros"+zero);
       }

    }*/
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
        public static void main (String[] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            /*sumOdd(n);*/
        /*char ch='y';
        do {
            System.out.println(" enter the num you want to print");
            int n=sc.nextInt();
            System.out.println(n);
            acceptNum(n);
            System.out.println("do you want to print onother num");
            ch=sc.next().charAt(0);


        }while (ch=='y');*/
            fibonacci(n);
        }
    }

