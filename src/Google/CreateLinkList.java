package Google;

import java.util.*;
import Leetcode.Node;

public class CreateLinkList {


    //基于list递归创建一个链表
    public static  Node createLinkList(List<Integer> list) {
        if(list.size()==0){
            return null;
        }
        Node Head=new Node(list.get(0));
        Node headOfSubString=createLinkList(list.subList(1,list.size()));
        Head.setNext(headOfSubString);
        return Head;
    }

    //基于递归反转链表
    public static Node reverseNodeList(Node head){
        if (head==null || head.getNext()==null){
            return head;
        }
        Node newHead=reverseNodeList(head.getNext());
        head.getNext().setNext(head);
        head.setNext(null);
        return newHead;

    }

    //基于递归合并链表
    public Node immerageNode(Node head1,Node head2){
        if(head1==null){
            return head2;
        } else if(head2==null){
            return head1;
        }
        Node mergeNode=null;
        if(head1.getValue()>head2.getValue()){
            mergeNode=head2;
            mergeNode.next=immerageNode(head1,head2.next);
        }else{
            mergeNode=head1;
            mergeNode.next=immerageNode(head1.next,head2);
        }
        return mergeNode;
    }

    //基于递归相加链表的值
    public static Node sumOfTwoNodeList(Node l1,Node l2,int i){
        if(l1==null){
            return null;
        }
        Node head=new Node((l1.value+l2.value+i)%10);
        if((l1.value+l2.value+i)>=10){
            head.next=sumOfTwoNodeList(l1.next,l2.next,1);
        }else{
            head.next=sumOfTwoNodeList(l1.next,l2.next,0);
        }
        return head;
    }

    public static void main(String[] args) {
        Node Head1=createLinkList(Arrays.asList(1,2,3,4,5)) ;
        Node Head2=createLinkList(Arrays.asList(2,3,8,5,6));
        Node Head=sumOfTwoNodeList(Head1,Head2,0);
        Node newHead=reverseNodeList(Head);
        while(newHead!=null){
            System.out.println(newHead.value);
            newHead=newHead.next;
        }
    }
}
