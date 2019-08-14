package AimToOffer.chapter04;

import java.util.Arrays;

public class BooleanIsVerifySequence {
    class TreeNode{
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

    public boolean VerifySequenceOfBST(int[] nums){
        if (nums==null || nums.length==0){
            return false;
        }
        int length=nums.length;
        int root=nums[length-1];
        int rstart=0;
        for(int i=0;i<length;i++){
            if(nums[i]<root){
                rstart++;
            }
        }
        if(rstart==0){
            VerifySequenceOfBST(Arrays.copyOfRange(nums,0,length-1));
        }else{
            for(int i=rstart;i<length-1;i++){
                if(nums[i]<root){
                    return false;
                }
            }
            VerifySequenceOfBST(Arrays.copyOfRange(nums,0,rstart));
            VerifySequenceOfBST(Arrays.copyOfRange(nums,rstart,length-1));
        }
        return true;
    }

    public static void main(String[] args){
        int[] nums={5,7,6,9,11,10,8};
        System.out.println(new BooleanIsVerifySequence().VerifySequenceOfBST(nums));
    }


}
