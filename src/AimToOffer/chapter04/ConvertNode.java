package AimToOffer.chapter04;

public class ConvertNode {
    static class TreeNode{
        int value;
        TreeNode left;
        TreeNode right;

    }

    public void convertNode(TreeNode root){
        if(root==null){
            return;
        }
        TreeNode current_left=root.left;
        if(current_left==null){
            return;
        }
        TreeNode current_right=root.right;
        if(current_right==null){
            return;
        }
        if(current_left.right!=null){
            current_left=current_left.right;
        }
        current_left.right=root;
        root.left=current_left;
        if(current_right.left!=null){
            current_right=current_right.left;
        }
        root.right=current_right;
        current_right.left=root;
        convertNode(root.left);
        convertNode(root.right);
    }
}
