package Tree;

import java.util.ArrayList;

//给定一个从1到n的数组，求能组成的二叉搜索树的个数
public class NumOfBST {
    public int numOfBST(int n){
        if(n<=0){
            return 0;
        }
        int[] dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            for(int j=1;j<=i;j++){
                dp[i]+=dp[i-j]*dp[j-1];
            }
        }
        return dp[n];
    }

    public ArrayList<TreeNode> generateTrees(int n) {
        return createTrees(1,n);

    }
    //将所有可能存在的二叉搜索树存入list
    private ArrayList<TreeNode> createTrees(int start, int end){
        ArrayList<TreeNode> nodes=new ArrayList<>();
        if(start>end)
        {
            nodes.add(null);
            return nodes;
        }

        for(int i=start;i<=end;i++)
        {
            ArrayList<TreeNode> left=createTrees(start,i-1);
            ArrayList<TreeNode> right=createTrees(i+1,end);
            for(int j=0;j<left.size();j++)
            {
                for(int k=0;k<right.size();k++)
                {
                    TreeNode newNode=new TreeNode(i);
                    newNode.left=left.get(j);
                    newNode.right=right.get(k);
                    nodes.add(newNode);
                }
            }
        }
        return nodes;
    }
}
