package AimToOffer.chapter03;

public class DeleteDuplicateNode {
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

    public void deleteDuplicateNode(Node head){
        if(head==null){
            return;
        }
        Node target=head;
        Node targetPre=null;
        while(target!=null){
            Node targetNext=target.next;
            boolean needDelete=false;
            if(targetNext!=null && target.value==targetNext.value){
                needDelete=true;
            }
            if(!needDelete){
                targetPre=target;
                target=targetNext;
            }else {
                Node toDelete = targetNext;
                while(toDelete.next!=null && toDelete.next.value==target.value){
                    toDelete=toDelete.next;
                }
                Node joinNode=toDelete.next;
                target=joinNode;
                targetPre.next=target;
            }
        }
    }
}
