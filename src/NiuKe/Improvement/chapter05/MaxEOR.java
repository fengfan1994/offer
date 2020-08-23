package NiuKe.Improvement.chapter05;
//字数组的最大异或和，采用前缀树
//异或运算，位相同为0，不同为1
public class MaxEOR {

    public static class Node{
        public Node[] nexts=new Node[2];
    }

    public static class NUmTrie{
        public Node head=new Node();

        public void add(int num){
            Node cur=head;
            for(int move=31;move>=0;move--){
                int path=((num>>move)&1);
                cur.nexts[path]=cur.nexts[path]==null?new Node():cur.nexts[path];
                cur=cur.nexts[path];
            }
        }

        public int maxXor(int num){
            Node cur=head;
            int res=0;
            return 0;
        }
    }
}
