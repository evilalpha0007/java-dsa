package com.alphajava;

import java.util.Scanner;

public class basiclogicquestions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int reverse=0;
        int n;
        System.out.println(" enter the number you want to reverse ");
        n = sc.nextInt();
        int original=n;
        while (n > 0) {
            int reminder=n%10;
             reverse=reverse*10+reminder;
             n=n/10;
        }
        System.out.println(" your reverse number is "+reverse);
        if(reverse==original) {
            System.out.println(" the number is palindrome");
         }
        else {
            System.out.println(" the number is not palindrome");
        }
        int num;

        System.out.print("Enter the number: ");
        //reads the limit from the user
        num=sc.nextInt();
        if(isArmstrong(num))
        {
            System.out.print("Armstrong ");
        }
        else
        {
            System.out.print("Not Armstrong ");
        }
        }
    static boolean isArmstrong(int n)
    {
        int temp, digits=0, last=0, sum=0;
            //assigning n into a temp variable
        temp=n;
            //loop execute until the condition becomes false
        while(temp>0)
        {
            temp = temp/10;
            digits++;
        }
        temp = n;
        while(temp>0)
        {
            //determines the last digit from the number
            last = temp % 10;
                //calculates the power of a number up to digit times and add the resultant to the sum variable
            sum +=  (Math.pow(last, digits));
            //removes the last digit
            temp = temp/10;
        }
            //compares the sum with n
        if(n==sum)
            //returns if sum and n are equal
            return true;
            //returns false if sum and n are not equal
        else return false;
    }
}


