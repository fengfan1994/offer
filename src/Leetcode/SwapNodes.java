package Leetcode;


import Leetcode.ListNode;
import Test.Test3;


public class SwapNodes {
    /*
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        //head.next.next.next.next=new ListNode(7);
        ListNode k=new SwapNodes().swapPairs(head);
        while(k!=null){
            System.out.println(k.val);
            k=k.next;
        }
    }

    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode n=new ListNode(Integer.MAX_VALUE);
        n.next=head;
        ListNode cur=head,tail=head.next,pre=n,next=null;
        while(cur!=null && tail!=null){
            next=tail.next;
            tail.next=cur;
            pre.next=tail;
            cur.next=next;
            pre=cur;
            cur=cur.next==null?null:cur.next;
            tail=cur==null?null:cur.next;
        }
        return n.next;
    }
    public   ListNode partition(ListNode pHead, int x) {
        if(pHead==null){
            return null;
        }
        ListNode sH=null;
        ListNode sT=null;
        ListNode hH=null;
        ListNode hT=null;
        while(pHead!=null){
            if(pHead.val<x){
                if(sH==null){
                    sH=pHead;
                    sT=pHead;
                }else{
                    sT.next=pHead;
                    sT=sT.next;
                }
            }else{
                if(hH==null){
                    hH=pHead;
                    hT=pHead;
                }else{
                    hT.next=pHead;
                    hT=hT.next;
                }
            }
            pHead=pHead.next;
        }
        if(sH==null){
            return hH;
        }else{
            sT.next=hH;
            return sH;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null){
            if(fast.val!=slow.val){
                fast=fast.next;
                slow=slow.next;
            }else{
                while(fast!=null &&fast.val==slow.val){
                    fast=fast.next;
                }
                slow.next=fast;
            }
        }
        return head;
    }
    */
}
