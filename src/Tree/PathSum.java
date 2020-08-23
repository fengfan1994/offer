package Tree;

import java.util.ArrayList;

class TreeNode{
    TreeNode left;
    TreeNode right;
    int val;
    public TreeNode(int val){
        this.val=val;
    }
}
public class PathSum {
    //判断二叉树中是否有从根到叶节点的值之和等于目标值
    public static boolean hasPathSum(TreeNode root,int sum){
        if(root==null ){
            return false;
        }
        if(root.left==null && root.right==null && root.val==sum){
            return true;
        }
        return hasPathSum(root.left,sum-root.val) || hasPathSum(root.right,sum-root.val);
    }

    public ArrayList<ArrayList<Integer>> list=new ArrayList<>();

    //找到二叉树中所有路径和位目标值的路径，存入列表
    public  ArrayList<ArrayList<Integer>> hasPathSum1(TreeNode root,int sum){
        ArrayList<Integer> list1=new ArrayList<>();
        Path(root,sum,list1);
        return list;
    }

    public void Path(TreeNode root,int sum,ArrayList<Integer> list1){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null && root.val==sum){
            list1.add(root.val);
            list.add(new ArrayList<>(list1));
            list1.remove(list1.size()-1);
            return;
        }
        list1.add(root.val);
        Path(root.left,sum-root.val,list1);
        Path(root.right,sum-root.val,list1);
        list1.remove(list1.size()-1);
    }
}
