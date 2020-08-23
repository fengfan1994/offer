package Leetcode;
class ListNode{
    ListNode next;
    int val;
    public ListNode(int val){
        this.val=val;
    }
}
public class RotateList {
    public ListNode rotateRight(ListNode head, int n) {
        if(head==null ||head.next==null|| n<=0){
            return head;
        }
        ListNode cur=head;
        ListNode tail=null;
        int len=0;
        while(cur!=null){
            len++;
            //找到尾节点
            if(cur.next==null){
                tail=cur;
            }
            cur=cur.next;
        }
        n=n%len;
        if(n==0){
            return head;
        }
        cur=head;
        int index=1;
        while(index<(len-n)){
            cur=cur.next;
            index++;
        }
        ListNode nHead=cur.next;
        cur.next=null;
        tail.next=head;
        return nHead;
    }


}
