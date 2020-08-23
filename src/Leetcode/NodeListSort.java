package Leetcode;

import Leetcode.Node;
//使用归并排序将无序链表进行排序
public class NodeListSort {
    public static Node sortList(Node head){
        if(head ==null || head.next ==null) {
            return head;
        }
        Node mid = getMid(head);
        Node midNext = mid.next;
        mid.next =null;
        return mergeNodeList(sortList(head), sortList(midNext));

    }

    public static Node getMid(Node head){
        if(head==null ||head.next==null){
            return head;
        }
        Node fast=head;
        Node slow=head;
        while (slow.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public static Node mergeNodeList(Node head1,Node head2){
        if(head1==null || head2==null){
            return head1!=null?head1:head2;
        }
        Node cur1=head1;
        Node cur2=head2;
        Node preHead=new Node(0);
        Node head=preHead;
        while(cur1!=null && cur2!=null){
            if(cur1.value<=cur2.value){
                preHead.next=cur1;
                cur1=cur1.next;
            }else{
               preHead.next=cur2;
               cur2=cur2.next;
            }
            preHead=preHead.next;
        }
        if(cur1!=null){
            preHead.next=cur1;
        }
        if(cur2!=null){
            preHead.next=cur2;
        }
        return head.next;
    }
}
