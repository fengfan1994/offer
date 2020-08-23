package AimToOffer.chapter03;

public class ReverseList2 {
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

    public void reverseNodeList(Node head){
        Node reverseHead=null;
        Node target=head;
        Node targetPre=null;
        while(target!=null){
            Node next=target.next;
            if(next==null){
                reverseHead=next;
            }
            target.next=targetPre;
            targetPre=target;
            target=next;
        }
    }
}
