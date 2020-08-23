package AimToOffer.chapter04;

import java.util.Stack;

public class PathOfValue {
    static class TreeNode{
        int value;
        TreeNode left;
        TreeNode right;

        public int getValue() {
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

    public void pathOfValue(TreeNode root,int target){
        if(root.value>target){
            return;
        }
        if(root.value==target){
            System.out.println(root.value);
        }
        int sum=0;
        Stack<Integer> stack=new Stack<>();
        allPaths(root,sum,stack,target);

    }

    public void allPaths(TreeNode root,int sum,Stack<Integer> stack,int target){
       sum=sum+root.value;
       stack.push(root.value);
       boolean isLeaf=(root.left==null && root.right==null);
       if(sum==target && isLeaf){

       }
       if(root.left!=null){
           allPaths(root.left,sum,stack,target);
       }
       if(root.right!=null){
           allPaths(root.right,sum,stack,target);
       }
       stack.pop();
    }
}
