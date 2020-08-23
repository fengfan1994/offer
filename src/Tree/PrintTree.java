package Tree;

import java.util.Stack;

public class PrintTree {
    static class TreeNode{
        double value;
        TreeNode left;
        TreeNode right;
        public TreeNode(){
            super();
        }
        public TreeNode(double value,TreeNode left,TreeNode right){
            this.value=value;
            this.left=left;
            this.right=right;
        }

        public double getValue() {
            return value;
        }

        public void setValue(double value) {
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

    public void pre_order(TreeNode root){
        Stack<TreeNode> stack=new Stack<>();
        TreeNode nodePop;
        TreeNode current=root;
        while(current!=null || !stack.isEmpty()){
            System.out.println(current.value);
            stack.push(current);
            current=current.left;
            while(current==null && !stack.isEmpty()){
                current=stack.pop();
                current=current.right;
            }
        }
    }

    public void traverse_order(TreeNode root){
       Stack<TreeNode> stack=new Stack<>();
       TreeNode current=root;
       while(current!=null || !stack.isEmpty()){
           if(current.left!=null){
               stack.push(current.left);
               current=current.left;
           }else{
               System.out.println(current.value);
               current=current.right;
               while(current==null && !stack.isEmpty()){
                   current=stack.pop();
                   System.out.println(current.value);
                   current=current.right;
               }
           }
       }
    }
}
