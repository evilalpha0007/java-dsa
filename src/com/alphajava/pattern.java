package com.alphajava;

public class pattern {
    public static void main(String[] args) {

        int n = 5;

        /* for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                if((i+j) % 2 == 0) {
                    System.out.print(1+" ");
                } else {
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
        */
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++) {  //for space
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
       /* int num=n-1;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=num-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }*/
      /*  for(int i=1;i<=n ;i++) {
            for (int j=n ; j >=i; j--) {
                System.out.print(i);
            }
            System.out.println();
        }*/
       /* for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                    System.out.print(j);
            }
            System.out.println();
        }
*/


    }
}

