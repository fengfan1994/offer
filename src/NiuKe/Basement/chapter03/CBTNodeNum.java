package NiuKe.Basement.chapter03;

public class CBTNodeNum {
    public static class Node {
        public int value;
        public Node left;
        public Node right;

        public Node(int data) {
            this.value = data;
        }
    }

    public static int nodeNum(Node head){
        if(head==null){
            return 0;
        }
        return bs(head,1,mostLeftLevel(head,1));
    }

    public static int bs(Node node,int l,int h){
        if(l==h){
            return 1;
        }
        if(mostLeftLevel(node.right,l+1)==h){
            return (1<<(h-1)) +bs(node.right,l+1,h);
        }else{
            return (1<<(h-l-1))+bs(node.left,l+1,h);
        }
    }

    //完全二叉树的层数
    public static int mostLeftLevel(Node node,int level){
        while(node!=null){
            level++;
            node=node.left;
        }
        return level-1;
    }
}
