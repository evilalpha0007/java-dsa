package com.alphajava;

/*https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true*/
import java.util.*;
import java.io.*;

public class hackerrankloops2 {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int sum=a;
            for(int j=0;j<n;j++){
                sum+=b* Math.pow(2,j);
                System.out.print(sum+" ");
            }
            System.out.println();
        }
        in.close();
    }
}
