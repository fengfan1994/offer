package AimToOffer.chapter02;

import java.util.Arrays;

public class RebuildTree {
    static class TreeNode{
        int value;
        TreeNode left;
        TreeNode right;

        public TreeNode(int value){
            this.value=value;
        }
    }



    //基于前序和中序
    public TreeNode rebulidTree(int[] pre,int[] in){
        if(pre==null || in==null){
            return null;
        }
        if(pre.length==0 || in.length==0){
            return null;
        }
        TreeNode root=new TreeNode(pre[0]);
        for(int i=0;i<in.length;i++){
            if(in[i]==pre[0]){
                root.left=rebulidTree(Arrays.copyOfRange(pre,1,i+1),Arrays.copyOfRange(in,0,i));
                root.right=rebulidTree(Arrays.copyOfRange(pre,i+1,pre.length),Arrays.copyOfRange(in,i+1,in.length));
            }
        }
        return root;
    }

    //基于中序和后序
    public TreeNode inPost(int[] in,int[] pos){
        if(in==null || pos==null){
            return null;
        }
        if(in.length==0 || pos.length==0){
            return null;
        }
        TreeNode root=new TreeNode(pos[pos.length-1]);
        for(int i=0;i<in.length;i++){
            if(in[i]==pos[pos.length-1]){
                root.left=inPost(Arrays.copyOfRange(in,0,i),Arrays.copyOfRange(pos,0,i));
                root.right=inPost(Arrays.copyOfRange(in,i+1,in.length),Arrays.copyOfRange(pos,i,pos.length-1));
            }
        }
        return root;
    }
}
