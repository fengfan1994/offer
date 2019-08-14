package AimToOffer.chapter03;

import java.util.Stack;

public class ReverseList {
    class Node{
        int value;
        Node next;
        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
    //需要使用辅助内存，遍历两次链表，不是一种很好的方法
    public Node reverseList(Node head){
        if(head==null){
            return null;
        }
        Node target=head;
        Stack<Node> stack=new Stack<>();
        while(target!=null){
            stack.push(target);
            target=target.next;
        }
        Node newHead=stack.pop();
        Node k=newHead;
        while(!stack.empty()){
           k.next=stack.pop();
           k=k.next;
        }
        return newHead;
    }
}
