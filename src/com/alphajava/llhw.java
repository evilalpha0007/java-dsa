package com.alphajava;

public class llhw {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode swapPairs(ListNode head) {

        ListNode temp=new ListNode(-1), prev=temp,  current=head;
        temp.next=head;
        if(head==null||head.next==null){
            return head;
        }
        while (current!=null && current.next!=null){
            prev.next=current.next;
            current.next=current.next.next;
            prev.next.next=current;
            current=current.next;
            prev=prev.next.next;
        }
        return temp.next;
    }
}
