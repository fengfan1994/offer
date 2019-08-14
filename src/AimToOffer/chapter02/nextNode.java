package AimToOffer.chapter02;

public class nextNode {
    static class TreeNode{
        int value;
        TreeNode left;
        TreeNode right;
        TreeNode parent;

        public TreeNode(int value){
            this.value=value;
        }
    }

    public TreeNode getNextNode(TreeNode root,TreeNode target){
        TreeNode next=null;
       TreeNode node=target;
       //如果节点有右子节点
        if(node.right!=null){
           node=node.right;
           while(node.left!=null){
               node=node.left;
           }
           next=node;
           return next;
        }else if(node.parent!=null){
            TreeNode nodeParent=node.parent;
            while(nodeParent!=null && node==nodeParent.right){
                node=nodeParent;
                nodeParent=node.parent;
            }
            next=nodeParent;
        }
        return next;
    }
}
