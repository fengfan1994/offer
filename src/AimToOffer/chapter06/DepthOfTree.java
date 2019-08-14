package AimToOffer.chapter06;



public class DepthOfTree {
    static class TreeNode{
        int value;
        TreeNode left;
        TreeNode right;

        public TreeNode(int value, TreeNode left, TreeNode right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }
    //二叉树的深度
    public int dpethOfTree(TreeNode root){
        if(root==null){
            return 0;
        }
        int nLeft=dpethOfTree(root.left);
        int nRight=dpethOfTree(root.right);
        return (nLeft>nRight)?(nLeft+1):(nRight+1);
    }
    //判断树是否为平衡二叉树
    public boolean isBalance(TreeNode root){
        if(root==null){
            return true;
        }
        int left=dpethOfTree(root.left);
        int right=dpethOfTree(root.right);
        int differ=left-right;
        if(differ>1 || differ<-1){
            return false;
        }
        return isBalance(root.left) && isBalance(root.right);
    }
}
