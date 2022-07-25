package com.alphajava;

import java.util.*;
public class LL {
    node head;
    private int size;

    LL(){
        this.size=0;
    }

    class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
        node(int data, node next) {
            this.data = data;
            this.next = next;
            size++;
        }
    }

    public void addfirst(int data) {  // adding  at starting of linkedlist
        node newnode = new node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }


    public void addlast(int data) {
        node newnode = new node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        node currnode = head;
        while (currnode.next != null) {
            currnode = currnode.next;
        }
        currnode.next = newnode;
    }



    public void addatany(int data,int index){

        if(index==0){
            addfirst(data);
            return;
        }
        if(index==size){
            addlast(data);
            return;
        }
        node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        node newnode= new node(data,temp.next);
        temp.next=newnode;

    }



    public void printll() {
        if (head == null) {
            System.out.println(" the list is empty");
            return;
        }
        node currnode = head;
        while (currnode != null) {
            System.out.print(currnode.data + ">");
            currnode = currnode.next;
        }
        System.out.print("null");
        System.out.println();
    }



    public void deletefirst() {
        if (head == null) {
            System.out.println(" the list is empty");
            return;
        }
        size--;
        head = head.next;
    }



    public void deletelast() {
        if (head == null) {
            System.out.println(" the list is empty");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
        }
        node secondlast=head;
        node lastnode=head.next;
        while (lastnode.next!=null){
            lastnode=lastnode.next;
            secondlast=secondlast.next;
        }
        secondlast.next=null;
    }



    public void deleteatany(int index){
        if (head == null) {
            System.out.println(" the list is empty");
            return;
        }
        if(index==0){
            deletefirst();
            return;
        }
        if (index==size){
            deletelast();
            return;
        }
        node prev=get(index-1);
        prev.next=prev.next.next;
    }



    public node get(int index){
        node newnode=head;
        for(int i=0;i<index;i++){
            newnode=newnode.next;
        }
        return newnode;
    }



    public node find(int value){
        node newnode=head;
    while(newnode!=null){
        if(newnode.data==value){
            return newnode;
        }
        newnode=newnode.next;
    }
    return null;
    }


    public int getsize(){
    return size;
    }


    
    public void reverseiterate(){
        if(head==null || head.next==null){
            return;
        }
        node prevnode=head;
        node currnode=head.next;
        while(currnode!=null){
            node nextnode=currnode.next;
            currnode.next=prevnode;

             // update values
            prevnode=currnode;
            currnode=nextnode;
        }
        head.next=null;
        head=prevnode;
    }
    public node reverserecursive(node head){
        if(head==null  ){
            return head;
        }
        if(head.next==null){
            return head;
        }
        node newhead=reverserecursive(head.next);
        head.next.next=head;
        head.next=null;

        return newhead;
    }


    public static void main(String[] args) {
        LL list = new LL();
            list.addfirst(3);
            list.addfirst(2);
            list.addfirst(1);
            list.addlast(4);
            list.addatany(0,3);
           list.deleteatany(3);
            list.printll();
          /*  list.deletefirst();
            list.deletelast();*/

          /*list.reverseiterate();
         list.printll(); */


       /*   list.head=list.reverserecursive( list.head );
          list.printll();*/



        /*   LinkedList<Integer> list1= new LinkedList<>();    */
        /*
                list1.addFirst(1);
                list1.addFirst(5);
                list1.addLast(10);
                list1.addLast(20);
                list1.addLast(30);
                System.out.println(list1);
                System.out.println("The size of lis is "+ list1.size());
                list1.removeFirst();
                list1.removeLast();
                System.out.println(list1);
                System.out.println("The size of lis is "+ list1.size());

                for (int i=0; i<list1.size();i++){
                    System.out.print( list1.get(i) + ">");
                }
                 System.out.print("null");
         */
           
    }
}

