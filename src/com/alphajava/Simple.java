package com.alphajava;

class A{
    protected void msg(){System.out.println("Hello java");}
}

    public class Simple extends A{
       public void msg(){System.out.println("Hello java by me ");}//C.T.Error // default is more restrictive
        public static void main(String args[]){
            Simple obj=new Simple();
            obj.msg();
        }
    }

