package AimToOffer.chapter04;

import java.util.LinkedList;

public class PrintTreeNode {
    static class TreeNode{
        int value;
        TreeNode left;
        TreeNode right;
        public TreeNode(){
            super();
        }
        public TreeNode(int value,TreeNode left,TreeNode right){
            this.value=value;
            this.left=left;
            this.right=right;
        }

        public double getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public TreeNode getLeft() {
            return left;
        }

        public void setLeft(TreeNode left) {
            this.left = left;
        }

        public TreeNode getRight() {
            return right;
        }

        public void setRight(TreeNode right) {
            this.right = right;
        }
    }
    //将所有节点依据打印顺序加入一个队列
    public void printFromTopToBottom(TreeNode root){
        LinkedList<TreeNode> list=new LinkedList<>();
        if(root==null){
            return;
        }
        list.addLast(root);
        while (!list.isEmpty()){
            TreeNode node=list.pollFirst();
            System.out.print(node.value+" ");
            if(node.left!=null){
                list.addLast(node.left);
            }
            if(node.right!=null){
                list.addLast(node.right);
            }
        }
    }

    public void printTree(TreeNode root){
        if(root==null){
            return;
        }
        LinkedList<TreeNode> list=new LinkedList<>();
        list.addLast(root);
        int toBePrint=1;
        int nextLevel=0;
        while(!list.isEmpty()){
            TreeNode node=list.pollFirst();
            System.out.print(node.value+" ");
            if(node.left!=null){
                list.addLast(node.left);
                ++nextLevel;
            }
            if(node.right!=null){
                list.addLast(node.right);
                ++nextLevel;
            }
            --toBePrint;
            if(toBePrint==0){
                System.out.println();
                toBePrint=nextLevel;
                nextLevel=0;
        }
        }
    }

    public static void main(String[] args){
        TreeNode node4=new TreeNode(5,null,null);
        TreeNode node5=new TreeNode(7,null,null);
        TreeNode node6=new TreeNode(9,null,null);
        TreeNode node7=new TreeNode(11,null,null);
        TreeNode node2=new TreeNode(6,node4,node5);
        TreeNode node3=new TreeNode(10,node6,node7);
        TreeNode root=new TreeNode(8,node2,node3);
        new PrintTreeNode().printFromTopToBottom(root);
        System.out.println();
        new PrintTreeNode().printTree(root);
    }
}
