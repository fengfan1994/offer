package NiuKe.Basement.chapter07;

import java.util.Comparator;
import java.util.PriorityQueue;

//给定一个成本数组，一个利润数组，能够进行k次选择，求最大利润
public class MostProfit {
    public static class Node{
        public int p;
        public int c;
        public Node(int p,int c){
            this.p=p;
            this.c=c;
        }
    }
    //使用成本构建最小堆
    public static class MinCostComparator implements Comparator<Node> {

        @Override
        public int compare(Node o1, Node o2) {
            return o1.c - o2.c;
        }

    }
    //使用利润构建最大堆
    public static class MaxProfitComparator implements Comparator<Node> {

        @Override
        public int compare(Node o1, Node o2) {
            return o2.p - o1.p;
        }

    }

    public static int findMaximizedCaptial(int k,int w,int[] Profits,int[] Captial){
        Node[] nodes=new Node[Profits.length];
        for(int i=0;i<Profits.length;i++){
            nodes[i]=new Node(Profits[i],Captial[i]);
        }
        PriorityQueue<Node> minCostQ=new PriorityQueue<>(new MinCostComparator());
        PriorityQueue<Node> maxProfitQ=new PriorityQueue<>(new MaxProfitComparator());

        for(int i=0;i<nodes.length;i++){
            minCostQ.add(nodes[i]);
        }
        for(int i=0;i<k;i++){
            while(!minCostQ.isEmpty() && minCostQ.peek().c<=w){
                maxProfitQ.add(minCostQ.poll());
            }
            if(maxProfitQ.isEmpty()){
                return w;
            }
            w+=maxProfitQ.poll().p;
        }
        return w;
    }
}
