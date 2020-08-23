package Leetcode;

import java.util.ArrayList;

public class MaxPathSum {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int maxPathSum(TreeNode root){
        if(root==null){
            return 0;
        }
        ArrayList<Integer> list=new ArrayList<>();
        list.add(Integer.MIN_VALUE);
        help(root,list);
        return  list.get(0);
    }

    public static int help(TreeNode root,ArrayList<Integer> list){
        if(root==null){
            return 0;
        }
        int left=help(root.left,list);
        int right=help(root.right,list);
        int sum=root.val+(left>0?left:0)+(right>0?right:0);
        if(sum>list.get(0)){
            list.set(0,sum);
        }
        return root.val+Math.max(left,Math.max(right,0));
    }
}
