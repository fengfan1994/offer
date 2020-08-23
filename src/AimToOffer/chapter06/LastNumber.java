package AimToOffer.chapter06;

public class LastNumber {
    static class Node{
        int value;
        Node next;

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
        public Node(Node next,int value){
            this.value=value;
            this.next=next;
        }
    }

    //构造环形链表
    /*public Node getLastNode(Node start,int delete){
        int target=1;
        while(start.next!=start){
            if(target==delete){
                System.out.println(start.value);
                Node newNode=start.next;
                start=newNode;
                start.next=newNode.next;
                target=1;
            }else{
                target++;
                start=start.next;
            }
        }
        return start;
    }*/

    public static void main(String[] args){
        Node node5=new Node(null,4);
        Node node4=new Node(node5,3);
        Node node3=new Node(node4,2);
        Node node2=new Node(node3,1);
        Node node1=new Node(node2,0);
        node5.next=node1;
        Node start=node1;
        int target=1;
        int delete=3;
        while(start.next!=start){
            if(target==delete){
                System.out.println(start.value);
                start.value=start.next.value;
                start.next=start.next.next;
                target=1;
            }else{
                target++;
                start=start.next;
            }
        }
    }
}
