package AimToOffer.chapter04;

public class MirrorTree {
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
    //基于递归
    public void mirroeTree(TreeNode root){
        if(root==null){
            return;
        }
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
        if(root.left!=null) {
            mirroeTree(root.left);
        }
        if(root.right!=null) {
            mirroeTree(root.right);
        }
    }
}
