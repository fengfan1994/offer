package AimToOffer.chapter04;

public class IsSymmetrical {
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

    public boolean isSymmetricalTree(TreeNode root){
        if(root==null){
            return false;
        }else {
            return isSymmetricalTree(root.left,root.right);
        }
    }

    public boolean isSymmetricalTree(TreeNode root1,TreeNode root2){
        if(root1==null && root2==null){
            return true;
        }
        if(root1==null || root2==null){
            return false;
        }
        if(!EqualNum(root1.value,root2.value)){
            return false;
        }
        return isSymmetricalTree(root1.left,root2.right) && isSymmetricalTree(root1.right,root2.left);
    }

    public boolean EqualNum(double num1,double num2){
        if(num1-num2>-0.00000001 && num1-num2<0.00000001){
            return true;
        }else{
            return false;
        }
    }
}
