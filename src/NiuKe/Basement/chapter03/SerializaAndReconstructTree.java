package NiuKe.Basement.chapter03;

import java.util.LinkedList;
import java.util.Queue;

//序列化和反序列化二叉树
public class SerializaAndReconstructTree {
    public static class Node {
        public int value;
        public Node left;
        public Node right;

        public Node(int data) {
            this.value = data;
        }
    }

    public static String serialByPre(Node head){
        if(head==null){
            return "#!";
        }
        String res=head.value+"!";
        res+=serialByPre(head.left);
        res+=serialByPre(head.right);
        return res;
    }

    public static Node reconByPreString(String preStr){
        String[] values=preStr.split("!");
        Queue<String> queue=new LinkedList<String>();
        for(int i=0;i<values.length;i++){
            queue.offer(values[i]);
        }
        return reconPreOrder(queue);
    }

    public static Node reconPreOrder(Queue<String> queue){
        String value=queue.poll();
        if(value.equals("#")){
            return null;
        }
        Node head=new Node(Integer.valueOf(value));
        head.left=reconPreOrder(queue);
        head.right=reconPreOrder(queue);
        return head;
    }


}
