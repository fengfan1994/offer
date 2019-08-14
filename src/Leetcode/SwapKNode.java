package Leetcode;

import java.util.Scanner;

public class SwapKNode {
    static class Node{
        int val;
        Node next;
        public Node(int val){
            this.val=val;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String s=sc.nextLine();
            int k=sc.nextInt();
            Node head=getHead(s);
            Node res=getResult(head,k);
            while(res!=null){
                System.out.println(res.val);
                res=res.next;
            }
        }
    }

    public static Node getResult(Node head,int k){
        if(k<2){
            return head;
        }
        Node cur=head;
        Node start=null,pre=null,next=null;
        int count=1;
        while(cur!=null){
            next=cur.next;
            if(count==k){
                start=pre==null?head:pre.next;
                head=pre==null?cur:head;
                reverseList(pre,start,cur,next);
                pre=start;
                count=0;
            }
            count++;
            cur=next;
        }
        return head;
    }

    public static void reverseList(Node left,Node start,Node end,Node right){
        Node pre=start;
        Node cur=start.next;
        Node next=null;
        while(cur!=right){
            next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
        }
        if(left!=null){
            left.next=end;
        }
        start.next=right;
    }

    public  static Node getHead(String s){
        String[] str=s.split(" ");
        Node head=new Node(Integer.parseInt(str[0]));
        Node cur=head;
        for(int i=1;i<str.length;i++){
            cur.next=new Node(Integer.parseInt(str[i]));
            cur=cur.next;
        }
        return head;
    }

}
