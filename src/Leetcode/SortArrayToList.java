package Leetcode;

public class SortArrayToList {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val=val;
        }
    }

    public TreeNode tranfer(int[] arr,int left,int right){
        if(left>right){
            return null;
        }
        if(left==right){
            return new TreeNode(arr[left]);
        }
        int mid=(left+right)>>1;
        TreeNode root=new TreeNode(arr[mid]);
        root.left=tranfer(arr,left,mid-1);
        root.right=tranfer(arr,mid+1,right);
        return root;
    }
}
