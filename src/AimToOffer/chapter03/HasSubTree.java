package AimToOffer.chapter03;

public class HasSubTree {
    class TreeNode{
        double value;
        TreeNode left;
        TreeNode right;

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
    //找到与目标树根节点值相同的节点
    public boolean hasSubTree(TreeNode root1,TreeNode root2){
        boolean result=false;
        if(root1!=null && root2!=null){
            if(EqualNumber(root1.value,root2.value)){
                return Tree1HasTree2(root1,root2);
            }
            if(!result){
                result=hasSubTree(root1.left,root2);
            }
            if(!result){
                result=hasSubTree(root1.right,root2);
            }
        }
        return result;
    }
    //判断是否为子树的方法
    public boolean Tree1HasTree2(TreeNode root1,TreeNode root2){
        if(root2==null){
            return true;
        }
        if(root1==null){
            return false;
        }
        if(!EqualNumber(root1.value,root2.value)){
            return false;
        }else{
            return Tree1HasTree2(root1.left,root2.left) && Tree1HasTree2(root1.right,root2.right);
        }
    }
    //不能用==判断两个小数是否相等
    public boolean EqualNumber(double num1,double num2){
        if((num1-num2>-0.00000001)&&(num1-num2<0.00000001)){
            return true;
        }else{
            return false;
        }
    }
}
