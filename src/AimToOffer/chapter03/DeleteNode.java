package AimToOffer.chapter03;

public class DeleteNode {
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

    public void deleteNode(Node head,Node target){
        if(head==null){

        }
        if(head==target){
            head=null;
        }
        Node targetNext=target.next;
        //区分该节点有无下一个节点
        if(target.next!=null) {
            target = targetNext;
            target.next = targetNext.next;
        }else{
            Node targetPre=head;
            while(targetPre.next!=target){
                targetPre=targetPre.next;
            }
            targetPre.next=null;
        }
    }
}
