package AimToOffer.chapter03;

//将两个非空链表对应节点元素相加,并以相加后最后一个元素为新链表节点
public class SumOfTwoNodeList {
    static class ListNode{
        int value;
        ListNode next;

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public ListNode getNext() {
            return next;
        }

        public void setNext(ListNode next) {
            this.next = next;
        }

        public ListNode(int value){
            this.value=value;
        }
    }

    public ListNode sumOfTwoNodeList(ListNode l1,ListNode l2,int i){
        if(l1==null){
            return null;
        }
        ListNode head=new ListNode((l1.value+l2.value)%10+i);
        if(l1.value+l2.value>=10){
            head.next=sumOfTwoNodeList(l1.next,l2.next,1);
        }else{
            head.next=sumOfTwoNodeList(l1.next,l2.next,0);
        }
        return head;
    }
}
