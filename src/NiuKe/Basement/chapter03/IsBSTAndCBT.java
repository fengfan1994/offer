package NiuKe.Basement.chapter03;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class IsBSTAndCBT {
    public static class Node {
        public int value;
        public Node left;
        public Node right;

        public Node(int data) {
            this.value = data;
        }
    }

    //二分搜索树是左节点都比当前节点小，右节点都比当前节点大的二叉树
    //采用中序遍历的顺序满足题意则满足要求
    public static boolean isBST(Node root){
        if(root==null){
            return true;
        }
        Stack<Node> stack=new Stack<>();
        Node pre=null;
        while(root!=null || !stack.isEmpty()){
            if(root==null){
                Node cur=stack.pop();
                if(pre!=null){
                    if(cur.value<=pre.value){
                        return false;
                    }
                }
                pre=cur;
                root=cur.right;
            }else{
                stack.push(root);
                root=root.left;
            }
        }
        return true;
    }

    //判断一棵树是不是完全二叉树
    /*
    2.1>如果一个结点左右孩子都不为空，则pop该节点，将其左右孩子入队列；
　　2.1>如果遇到一个结点，左孩子为空，右孩子不为空，则该树一定不是完全二叉树；
　　2.2>如果遇到一个结点，左孩子不为空，右孩子为空；或者左右孩子都为空；
        则该节点之后的队列中的结点都为叶子节点；该树才是完全二叉树，否则就不是完全二叉树
     */
    public static boolean isCompleteTree(Node head){
        if(head==null){
            return true;
        }
        Queue<Node> queue=new LinkedList<>();
        boolean leaf=false;
        Node l=null;
        Node r=null;
        queue.offer(head);
        while(!queue.isEmpty()){
            head=queue.poll();
            l=head.left;
            r=head.right;
            if((leaf && (l!=null || r!=null)) || (l==null && r!=null)){
                return false;
            }
            if(l!=null){
                queue.offer(l);
            }
            if(r!=null){
                queue.offer(r);
            }else{
                leaf=true;
            }
        }
        return true;
    }
}
