package com.alphajava;

public class recurssion1 {
    public static int factorial(int n){
        int facto;
        if(n==0 || n==1){
            return 1;
        }

        facto= n* factorial(n-1);
        return facto;
    }
    public static void fibonancii(int n1,int n2,int n) {
        if (n==0){
            return;
        }

            int n3=n2+n1;
        System.out.println(n3);
        fibonancii(n2,n3,n-1);

    }
    public static int calcpow(int x, int n){    // stack height is n-1
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        int pow=x*calcpow(x,n-1);
        return pow;
    }
    //reducing stack height to log(n)
    public static int calcpowby(int x, int n){    // stack height is n-1
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
       if(n%2==0){  // n is even
          return calcpowby(x,n/2)*calcpowby(x,n/2);
       }
       else { // n is odd
           return calcpowby(x,n/2)*calcpowby(x,n/2)*x;
       }
    }
    public static int sumofdig(int n){
        if(n==0){
            return 0;
        }
        return  n%10+sumofdig(n/10);
    }
    public static int countzeros(int n, int c){
        if(n==0){
            return c;
        }
        int reminder=n%10;
        if(reminder==0){
           return countzeros(n/10,c+1);
        }
            return countzeros(n/10,c);

    }
    public static int numberOfSteps(int num) {   // LEETCODE PROBLEM
       return helper(num,0);  /* initially the number of steps is zero */
    }
    public static int helper(int num,int steps){
        if(num==0){
            return steps;
        }
        if(num%2==0){
           return helper(num/2,steps+1);
        }
        return helper(num-1,steps+1);
    }
    public static void main(String args[]){
      /* int ans=factorial(5);
        System.out.println(ans);*/

        /*  int a=0; int b=1;
             int n=7;
             System.out.println(a);
             System.out.println(b);
             fibonancii(a,b,n-2);       */

       /* int ans=calcpow(0,3);
        System.out.println(ans);*/

//        int ans=calcpow(2,5);
//        System.out.println(ans);

        int ans1=sumofdig(1342);
        System.out.println(ans1);

        int ans2=countzeros(1004050405,0);
        System.out.println(ans2);

    }
}
