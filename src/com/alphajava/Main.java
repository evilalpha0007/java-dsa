package com.alphajava;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println(" Enter milleage");
        int n= sc.nextInt();



        vehicle v=new vehicle();
        v.setName(" activa ");
        v.setMileage(n);
        v.setRegno(6558);
        v.setCapacity(20);


        System.out.println(" the vehicle name is"+ " "+v.getName());
        System.out.println(" the vehicle mileage is"+" "+ v.getMileage());
        System.out.println(" the vehicle regstration number is"+ " "+v.getRegno());
    }
}
