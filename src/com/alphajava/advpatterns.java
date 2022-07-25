package com.alphajava;

public class advpatterns {
    public static void main(String[] args) {
        int n = 4;
        /* BUTTERFLY */
        /*for (int i = 1; i <= n; i++) {
            int space = 2 * (n - i);
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            int space = 2 * (n - i);
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/
            /* DIAMOND */
  /*      for (int i = 1; i <= n; i++) {
            int star = (2 * i) - 1;
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= star; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            int star = (2 * i) - 1;
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
       System.out.println();*/
       /* HOLLOW DIAMOND */
        /*for (int i = 1; i <= n; i++) {
            int star = (2 * i) - 1;
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= star; j++) {

                if (i == 1 || i == 2 * i - 1 || j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            int star = (2 * i) - 1;
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= star; j++) {
                if (i == 1 || i == 2 * i - 1 || j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/

      /* for(int i=1;i<=n ;i++) {
            for (int j=n ; j >=i; j--) {
                System.out.print(i);
            }
            System.out.println();
        }
*/
        /* heart shape*/
        for (int i = 1; i <= 2; i++) {
            for (int k = 1; k <= 2 - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= 2 * (2 - i+1)-1 ; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 5; i >= 1; i--) {
            int star = (2 * i) - 1;
            for (int j = 1; j <= n - i+1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}

