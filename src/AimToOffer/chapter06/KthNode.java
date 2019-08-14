package AimToOffer.chapter06;


public class KthNode {
    static class TreeNode{
        int value;
        TreeNode left;
        TreeNode right;
        public TreeNode(int value,TreeNode left,TreeNode right){
            this.value=value;
            this.left=left;
           this.right=right;
        }
    }

    int index=0;
    /* 一定要理解递归的思想，其实就是弄清楚一个节点，其它照抄就行
       关键是一定要把这个节点的所有情况都弄清楚，特别是递归结束的条件
     */

    public TreeNode kthNode(TreeNode root,int k){
        if(root!=null){
            TreeNode node=kthNode(root.left,k);
            if(node!=null){
                return node;
            }
            index++;
            if(index==k){
                return root;
            }
            node=kthNode(root.right,k);
            if(node!=null){
                return node;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        TreeNode node4 = new TreeNode(5, null, null);
        TreeNode node5 = new TreeNode(7, null, null);
        TreeNode node6 = new TreeNode(9, null, null);
        TreeNode node7 = new TreeNode(11, null, null);
        TreeNode node2 = new TreeNode(6, node4, node5);
        TreeNode node3 = new TreeNode(10, node6, node7);
        TreeNode root = new TreeNode(8, node2, node3);
        System.out.println(new KthNode().kthNode(root,3).value);
    }
}
