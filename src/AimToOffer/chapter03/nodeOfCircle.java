package AimToOffer.chapter03;

public class nodeOfCircle {
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

    public Node meetNodeOfLoop(Node head){
        if(head==null){
            return null;
        }
        Node slow=head;
        Node fast=slow.next;
        if(fast==null){
            return null;
        }
        while(fast!=null && slow!=null){
            if(fast==slow){
                return fast;
            }
            slow=slow.next;
            fast=fast.next;
            if(fast!=null){
                fast=fast.next;
            }
        }
        return null;
    }

    public int numberOfNodeInLoop(Node meetNode){
        int count=1;
        Node slow=meetNode;
        while(slow.next!=meetNode){
            slow=slow.next;
            ++count;
        }
        return count;
    }

    public Node startOfCircle(Node head,int num){
        Node fast=head;
        Node slow=head;
        for(int i=1;i<=num;i++){
            fast=fast.next;
        }
        while(fast!=slow){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }

}
