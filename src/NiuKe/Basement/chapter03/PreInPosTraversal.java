package NiuKe.Basement.chapter03;

import java.util.Stack;

//以递归和非递归两种方式实现二叉树的三种遍历
public class PreInPosTraversal {
    public static class Node {
        public int value;
        public Node left;
        public Node right;

        public Node(int data) {
            this.value = data;
        }
    }

    public static void preOrderRecur(Node head){
        if(head==null){
            return;
        }
        System.out.println(head.value);
        preOrderRecur(head.left);
        preOrderRecur(head.right);
    }

    public static void preOrderUnRecur(Node head){
        if(head!=null){
            Stack<Node> stack=new Stack<>();
            stack.add(head);
            while(!stack.isEmpty()){
                head=stack.pop();
                System.out.println(head.value+" ");
                if(head.right!=null){
                    stack.push(head.right);
                }
                if(head.left!=null){
                    stack.push(head.left);
                }
            }
        }
    }

    public static void inOrderRecur(Node head){
        if(head==null){
            return;
        }
        inOrderRecur(head.left);
        System.out.println(head.value);
        inOrderRecur(head.right);
    }

    public static void inOrderUnRecur(Node head){
        if(head!=null){
            Stack<Node> stack=new Stack<>();
            while(!stack.isEmpty() || head!=null){
                if(head!=null){
                    stack.push(head);
                    head=head.left;
                }
                else{
                    head=stack.pop();
                    System.out.println(head.value+" ");
                    head=head.right;
                }
            }
        }
        System.out.println();
    }

    public static void posOrderRecur(Node head){
        if(head==null){
            return;
        }
        posOrderRecur(head.left);
        posOrderRecur(head.right);
        System.out.println(head.value);
    }

    public static void posOrderUnRecur(Node head){
        if(head!=null){
            Stack<Node> s1=new Stack<>();
            Stack<Node> s2=new Stack<>();
            s1.push(head);
            while (!s1.isEmpty()){
                head=s1.pop();
                s2.push(head);
                if(head.left!=null){
                    s1.push(head.left);
                }
                if(head.right!=null){
                    s1.push(head.right);
                }
            }
            while (!s2.isEmpty()){
                System.out.println(s2.pop().value+" ");
            }
        }
        System.out.println();
    }
}
