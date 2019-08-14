package NiuKe.Basement.chapter02;

import java.util.HashMap;

public class CopyListWithRandom {
    public static class Node {
        public int value;
        public Node next;
        public Node rand;

        public Node(int data) {
            this.value = data;
        }
    }

    //采用hashmap存储出现的节点
    public static Node copyListWithRand1(Node head){
        HashMap<Node,Node> map=new HashMap<>();
        Node cur=head;
        while(cur!=null){
            map.put(cur,new Node(cur.value));
            cur=cur.next;
        }
        cur=head;
        while(cur!=null){
            map.get(cur).next=map.get(cur.next);
            map.get(cur).rand=map.get(cur.rand);
            cur=cur.next;
        }
        return map.get(head);
    }

    //不需要额外空间的做法
    public static Node copyListWithRand2(Node head){
        if(head==null){
            return null;
        }
        Node cur=head;
        Node next=null;
        //将每个节点复制，并连接在元节点后
        while(cur!=null){
            next=cur.next;
            cur.next=new Node(cur.value);
            cur.next.next=next;
            cur=next;
        }
        //为复制的节点设置random节点
        cur=head;
        Node curCopy=null;
        while(cur!=null){
            next=cur.next.next;
            curCopy=cur.next;
            curCopy.rand=cur.rand!=null ? cur.rand.next:null;
            cur=next;
        }
        Node res=head.next;
        cur=head;
        //分离复制的节点，连接成链表
        while(cur!=null){
            next=cur.next.next;
            curCopy=cur.next;
            cur.next=next;
            curCopy.next=next!=null?next.next:null;
            cur=next;
        }
        return res;
    }
}
