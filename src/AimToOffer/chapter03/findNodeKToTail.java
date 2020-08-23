package AimToOffer.chapter03;

public class findNodeKToTail {
    class Node {
        int value;
        Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
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

    public Node findNode(Node head,int k){
        if(head==null){
            return null;
        }
        Node first=head;
        Node second=head;
        int count=1;
        while(count!=k){
            if(first.next!=null){
                first=first.next;
            }else{
                return null;
            }
            ++count;
        }
        while(first.next!=null){
            first=first.next;
            second=second.next;
        }
        return second;
    }

}
