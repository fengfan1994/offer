package NiuKe.Basement.chapter03;
//左右节点高度差不超过1的二叉树
public class IsBalancesTree {
    public static class Node {
        public int value;
        public Node left;
        public Node right;

        public Node(int data) {
            this.value = data;
        }
    }

    public static boolean isBalance(Node root){
        if(root==null){
            return true;
        }
        if(Math.abs(treeHeight(root.left)-treeHeight(root.right))>1){
            return false;
        }
        return isBalance(root.left) && isBalance(root.right);
    }

    public static int treeHeight(Node root){
        if(root==null){
            return 0;
        }
        return Math.max(treeHeight(root.left),treeHeight(root.right))+1;
    }
}
