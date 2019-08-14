package AimToOffer.chapter05;

import java.util.Stack;

public class FirstCommonNode {
    static class Node{
        int value;
        Node next;

        public Node(int value,Node next){
            this.next=next;
            this.value=value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", next=" + next +
                    '}';
        }
    }

    public Node getFirstCommonNode(Node root1,Node root2){
        if(root1==null || root2==null ){
            return null;
        }
        Stack<Node> stack1=new Stack<>();
        Stack<Node> stack2=new Stack<>();
        while(root1!=null){
            stack1.push(root1);
            root1=root1.next;
        }
        while(root2!=null){
            stack2.push(root2);
            root2=root2.next;
        }
        while(!stack1.empty() && !stack2.empty() && stack1.peek()==stack2.peek()){
            stack1.pop();
            stack2.pop();
        }

        return stack1.peek().next;
    }

    public static void main(String[] args){
        Node seven=new Node(7,null);
        Node six=new Node(6,seven);
        Node five=new Node(5,six);
        Node four=new Node(4,five);
        Node three=new Node(3,six);
        Node two=new Node(2,three);
        Node one=new Node(1,two);
        System.out.println(new FirstCommonNode().getFirstCommonNode(one,four));
    }
}
