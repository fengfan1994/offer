package Test;


import java.util.ArrayList;
import java.util.Arrays;



public class Test4 {

    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
         head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);
        head.next.next.next.next.next=new ListNode(6);
        //head.next.next.next.next.next.next=new ListNode(7);
        ListNode cur=new Test4().reverseList(head);
        while (cur!=null){
            System.out.println(cur.val);
            cur=cur.next;
        }
    }

    public ListNode reverseList(ListNode head){
        if(head==null || head.next==null){
            return null;
        }
        ListNode fast=head,slow=head;
        //slow指向链表的中间节点
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode tail=fast.next==null?fast:fast.next;
        ListNode pre=slow,cur=slow.next,next=null;
        //将中点之后的链表反转
        while (cur!=null){
            next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
        }
        ListNode p1=head,p2=tail;
        ListNode temp=null;
        while(p1!=slow){
            next=p1.next;
            temp=p2.next;
            p1.next=p2;
            p2.next=next;
            p1=next;
            p2=temp;
        }
        if(p2!=slow){
            slow.next=p2;
            p2.next=null;
        }else{
            p2.next=null;
        }

        return head;
    }

    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode n=new ListNode(Integer.MAX_VALUE);
        n.next=head;
        ListNode pre=n;
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null){
            if(fast.val!=slow.val){
                slow=slow.next;
                fast=fast.next;
                pre=pre.next;
            }else{
                while(fast.next!=null && fast.next.val==slow.val){
                    fast=fast.next;
                }
                pre.next=fast.next;
                slow=pre.next;
                fast=slow==null?null:pre.next.next;
            }
        }
        return n.next;
    }
}
