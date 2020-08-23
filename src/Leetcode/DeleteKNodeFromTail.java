package Leetcode;

import Google.CreateLinkList;

import java.util.Arrays;
//删除链表倒数第k个节点
public class DeleteKNodeFromTail {

    public Node removeNthFromEnd(Node head, int n) {
        if(head==null){
            return null;
        }
        Node start1=head;
        Node start2=head;
        while(n>0){
            if(start1!=null){
                start1=start1.next;
                n--;
            }else{
                return head;
            }
        }
        if(start1!=null){
            while(start1.next!=null){
                start1=start1.next;
                start2=start2.next;
            }
            start2.next=start2.next.next;
            return head;
        }else{
            Node newHead=head.next;
            return newHead;
        }
    }

    public static void main(String[] args) {
        Node Head1=CreateLinkList.createLinkList(Arrays.asList(1,2,3,4,5,6,7,8));
        Node head=(new DeleteKNodeFromTail().removeNthFromEnd(Head1,9));
        while(head!=null){
            System.out.println(head.value);
            head=head.next;
        }
    }
}
