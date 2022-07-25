package com.alphajava;

import java.util.*;

public class condition {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        /*System.out.println(" Enter your age ");
        int age=sc.nextInt();
        if (age>=18){
            System.out.println(" You are an adult");
        }
        else {
            System.out.println(" grow up buddy");
        }
        System.out.println(" Enter number to be checked");
        int num=sc.nextInt();
        if (num%2==0){
            System.out.println(" the number is even");
        }
        else{
            System.out.println(" the number is odd");
        }*/
        System.out.println(" Enter any number ");
        int a= sc.nextInt();
        System.out.println(" Enter second number ");
        int b=sc.nextInt();
        int sum;
        char c=sc.next().charAt(0);
        switch (c){
            case '+': sum=a+b;
                System.out.println(sum);
            break;
            case '-': sum=a-b;
                System.out.println(sum);
            break;
            case '*': sum=a*b;
                System.out.println(sum);
        }


    }
}
