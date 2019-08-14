package AimToOffer.chapter02;

import java.util.EmptyStackException;
import java.util.Stack;

public class reverseListNode {
    //静态内部类
   static class node{
        String value;
        node next;

        public node(String value,node next){
            this.value=value;
            this.next=next;
        }

        public node(){
            super();
        }

        public void setValue(String value){
            this.value=value;
        }
        public void setNext(node next){
            this.next=next;
        }

        public String getValue(node n){
            return n.value;
        }
    }

    public static void main(String[] args)throws EmptyStackException{
        node forth=new node("fengfan",null);
        node third=new node("yangmi",forth);
        node second=new node("wangou",third);
        node first=new node("dilireba",second);
        new reverseListNode().reverseShow(first);

    }

    public void reverseShow(node n)throws EmptyStackException{
        Stack<node> stack=new Stack<>();
        node current=n;
        while(current!=null){
            stack.push(current);
            current=current.next;
        }
       current=stack.pop();
        while(current!=null){
            System.out.println(current.getValue(current));
            current=stack.pop();

        }
   }

    public void show(node n){
       node current=n;
       while(current!=null){
           System.out.println(current.getValue(current));
           current=current.next;
       }
    }
}
