package com.alphajava;

import java.util.*;

public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" hi welcome");
        int c;
        do {
            System.out.println("If you want to enter the marks press 1 and to stop press o");
            c= sc.nextInt();
            if (c == 1) {
                System.out.println(" enter the marks ");
                int marks= sc.nextInt();
                if (marks>=90){
                    System.out.println(" This is Good ");
                }
                else if (marks<=89 && marks>=60){
                    System.out.println(" This is also good ");
                }
                else {
                    System.out.println(" This is good as well ");
                }
            }
            else{
                System.out.println(" Thanks for visiting");
            }
        } while (c==1);

    }
}