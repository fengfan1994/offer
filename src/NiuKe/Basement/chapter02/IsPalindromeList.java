package NiuKe.Basement.chapter02;

import java.util.Stack;

//判断是否是回文链表
public class IsPalindromeList {
    public static class Node {
        public int value;
        public Node next;

        public Node(int data) {
            this.value = data;
        }
    }

    //需要辅助内存的方法
    public static boolean isPalindrome1(Node head){
        Stack<Node> stack=new Stack<>();
        Node cur=head;
        while(cur!=null){
            stack.push(cur);
            cur=cur.next;
        }
        while(head!=null){
            if(head.value!=stack.pop().value){
                return false;
            }
            head=head.next;
        }
        return true;
    }

    //不需要辅助内存的方法
    public static boolean isPalindrome2(Node head){
        if(head==null || head.next==null){
            return true;
        }
        Node n1=head;
        Node n2=head;
        //寻找链表的中点，当n2到尾时n1处于链表中间
        while (n2.next!=null && n2.next.next!=null){
            n1=n1.next; //n1->mid
            n2=n2.next.next;//n2->end
        }
        n2=n1.next;// right part first node
        n1.next=null;
        Node n3=null;
        while (n2!=null){//right part convert
            n3=n2.next;
            n2.next=n1;
            n1=n2;
            n2=n3;
        }
        n3=n1;
        n2=head;
        boolean res=true;
        while (n1!=null && n2!=null){
            if(n1.value !=n2.value){
                res=false;
                break;
            }
            n1=n1.next;
            n2=n2.next;
        }
        n1 = n3.next;
        n3.next = null;
        while (n1 != null) { // recover list
            n2 = n1.next;
            n1.next = n3;
            n3 = n1;
            n1 = n2;
        }
        return res;
    }
}
