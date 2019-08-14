package AimToOffer.chapter04;

public class CopyComplexListNode {
    static class Node{
        int value;
        Node next;
        Node random;
    }
    public  void copyNode(Node head){
        Node newHead=new Node();
        newHead=head;
        while(head.next!=null){
            Node node=new Node();
            node=head.next;
            newHead.next=node;
            head=head.next;
            newHead=newHead.next;
        }
    }
}
