package NiuKe.Basement.chapter03;

import java.util.LinkedList;
import java.util.Stack;

public class PrintBinaryTree {
    public static class Node {
        public int value;
        public Node left;
        public Node right;

        public Node(int data) {
            this.value = data;
        }
    }

    //按行打印
    public static void printTree(Node head){
        if(head==null){
            return;
        }
        LinkedList<Node> list=new LinkedList<>();
        list.addLast(head);
        while(!list.isEmpty()){
            Node n=list.pollFirst();
            System.out.println(n.value);
            if(n.left!=null){
                list.addLast(n.left);
            }
            if(n.right!=null){
                list.add(n.right);
            }
        }
    }


}
