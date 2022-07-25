package com.alphajava;

import java.util.*;

    interface Bank{   // interface and abstraction and method overridding concept is used
      public   void transaction();
      public   void checkbal();
      public   void invest();
      public  void withdrawmoney();

        allbanks b=new allbanks(); // package concept used here

    }


class HDFC implements Bank{  // inheritance concept used

        Scanner sc=new Scanner(System.in);
        private int accontnum;
        private String accounttype;
        private int mybalance;
         int withdraw;
        HDFC(){
            System.out.println(" welcome to HDFC  bank");
            System.out.println("Enter your account type");
            accounttype=sc.nextLine();
            b.setAccounttype(accounttype);
            System.out.println("Enter your account number");
            accontnum=sc.nextInt();
            b.setAccountno(accontnum);
        }
        public void transaction(){
            System.out.println(" your transaction can be easily carried via this bank");

            System.out.println("Your account number is "+b.getAccountno()+" having account type  "+b.getAccounttype());
        }
    public void invest(){
        System.out.println(" Enter the money you want to invest in our bank");
        int money= sc.nextInt();
        System.out.println(" You have successfully invested Rs"+" "+money+" in our bank");
        b.setBalance(money);
        mybalance= b.getBalance();
    }
    public void withdrawmoney(){
        System.out.println("Enter the Amount to Withdraw");
        withdraw=sc.nextInt();
        if(mybalance<withdraw){
            System.out.println("Insufficient Balance");
        }
        else{
            mybalance  = mybalance - withdraw;
            System.out.println("The Availale balance is"+mybalance);
        }
    }
        public void checkbal(){
            System.out.println(" NOW YOU CAN CHECK YOUR BALANCE");
            System.out.println("Your balance is: "+mybalance);
        }
    }


    public class oops1 {
        public static void main(String args[]){
            /* HDFC bank1=new HDFC();
            bank1.transaction();
            bank1.invest();
            bank1.checkbal(); */
            Scanner sc=new Scanner(System.in);
            char ch='y';
            Bank n=new HDFC();
           /*  n.transaction();
            n.invest();
            n.withdrawmoney();
            n.checkbal();*/

            while (ch=='y'|| ch=='Y')  // looping concept used
            {
                System.out.println(" enter your option ");
                System.out.println(" 1. to show and verify crendiatials  ");
                System.out.println(" 2. for depositing money ");
                System.out.println(" 3. for withdrawing money ");
                System.out.println(" 4. checking balance ");

                int   c=sc.nextInt();

                switch(c)
                {
                    case 1:  n.transaction();
                        break;
                    case 2:  n.invest();
                        break;
                    case 3: n.withdrawmoney();
                        break;
                    case 4:  n.checkbal();
                        break;
                    default:
                        System.out.println("Wrong choice ");
                }
                System.out.println(" do yo want to perform any other operation : (y/n) ");
                ch=sc.next().charAt(0);
            }


        }
}
    /* class DENA implements Bank{
        private int balance;
        Scanner sc = new Scanner(System.in);
        DENA(){
            System.out.println(" welcome to DENA  bank");
        }
        public void transaction(){
            System.out.println(" your transaction can be easily carried via this bank");
        }
        public void checkbal(){
            System.out.println(" NOW YOU CAN CHECK YOUR BALANCE");
            balance= sc.nextInt();
            System.out.println("Your balance is: "+balance);
        }
        public void invest(){
            System.out.println(" Enter the money you want to invest in our bank");
            int money= sc.nextInt();
            System.out.println(" You have sucessfully invested Rs"+" "+money+" in our bank");
        }

    }*/
        /*  DENA bank2=new DENA();
            bank2.transaction();
            bank2.checkbal();
            bank2.invest();*/