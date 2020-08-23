package Tree;
//寻找两个节点的最近公共祖先
public class NearestAncestor {
    class TreeNode{
        TreeNode left;
        TreeNode right;
        int val;
        public TreeNode(int val){
            this.val=val;
        }
    }

    public TreeNode getAncestor(TreeNode head,TreeNode n1,TreeNode n2){
        if(head==null || head==n1 || head==n2){
            return head;
        }
        TreeNode left=getAncestor(head.left,n1,n2);
        TreeNode right=getAncestor(head.right,n1,n2);
        if(left!=null && right!=null){
            return head;
        }
        return left!=null?left:right;
    }
}
