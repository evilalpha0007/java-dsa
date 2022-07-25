package com.alphajava;

public class DOUBLYLL {
    node head;
    public void insertatfirst(int data){
        node newnode= new node(data);
        newnode.next=head;
        newnode.prev=null;
        if (head!=null){
            head.prev=newnode;
        }
        head=newnode;
    }

    public void inseratlast(int data){
        node newnode=new node(data);

        if(head==null){
            insertatfirst(data);
            return;
        }
        node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
        newnode.prev=temp;
        newnode.next=null;

    }

   public  void display(){
        node newnode=head;
        node last=null;
        while(newnode!=null){
            System.out.print(newnode.data+" > ");
            last=newnode;
            newnode=newnode.next;
        }
        System.out.println("null");
        System.out.println();
        System.out.println(" printing in reverse");
        while (last!=null){
            System.out.print(last.data+" > ");
            last=last.prev;
        }
        System.out.println(" null ");
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

    public void insert(int after,int val){
        node p=find(after);
        if(p==null){
            System.out.println(" it does not exist");
            return;
        }
        node newnode=new node(val);
        newnode.next=p.next;
        newnode.prev=p;
        if (newnode.next!=null){
        newnode.next.prev=newnode;
        }
    }


    public static void main(String[] args){

        DOUBLYLL dll=new DOUBLYLL();
        dll.inseratlast(5);
        dll.insertatfirst(4);
        dll.insertatfirst(3);
        dll.insertatfirst(2);
        dll.inseratlast(6);
        dll.insertatfirst(1);
        dll.insert(3,9);
        dll.display();
    }
    class node{
        int data;
        node prev;
        node next;
         int size;

        node(int data){
            this.data = data;
            this.next = null;
            this.prev=null;
            size++;
        }

        public node(int data, node next,node prev) {
            this.data = data;
            this.next = next;
            this.prev=prev;
            size++;
        }
    }
}
