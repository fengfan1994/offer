package AimToOffer.chapter03;

public class ImmerageNodeList {
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
    //基于循环
    public Node immerageNodeList(Node start1,Node start2){
        //空链表
        if(start1==null && start2==null){
            return null;
        }
        if(start1==null){
            return start2;
        }else if(start2==null){
            return start1;
        }
        Node head=null;
        if(start1.value>start2.value){
            head=start2;
            start2=start2.next;
        }else{
            head=start1;
            start1=start1.next;
        }
        while(start1!=null && start2!=null){
            if(start1.value>start2.value){
                head.next=start2;
                head=head.next;
                start2=start2.next;
            }else{
                head.next=start1;
                head=head.next;
                start1=start1.next;
            }
        }
        if(start1==null){
            head.next=start2;
        }else{
            head.next=start1;
        }
        return head;
    }
    //基于递归
    public Node immerageNode(Node head1,Node head2){
        if(head1==null){
            return head2;
        }else if(head2==null){
            return head1;
        }

        Node mergeHead=null;
        if(head1.value>head2.value){
            mergeHead=head2;
            mergeHead.next=immerageNode(head1,head2.next);
        }else{
            mergeHead=head1;
            mergeHead.next=immerageNode(head1.next,head2);
        }
        return mergeHead;
    }
}
