package xiaozhao2018;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SelectRepresent {
    static class Node {
        int start;
        int end;
        public Node(int start,int end){
            this.start=start;
            this.end=end;
        }
    }

    static class cmp implements Comparator<Node>{
        @Override
        public int compare(Node o1, Node o2) {
            int res=o1.end-o2.end;
            if(res==0){
                return o2.start-o1.start;
            }
            return res;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            Node[] nodes=new Node[n];
            for(int i=0;i<n;i++){
                int a=sc.nextInt();
                int b=sc.nextInt();
                nodes[i]=new Node(a,b);
            }
            Arrays.sort(nodes,0,n,new cmp());
            int res=2;
            int ok1=nodes[0].end;
            int ok2=nodes[0].end-1;
            for(int i=1;i<n;i++){
                if(nodes[i].start>ok1){
                    res=res+2;
                    ok1=nodes[i].end;
                    ok2=nodes[i].end-1;
                }else if(ok1>=nodes[i].start && ok1<nodes[i].end && ok2<nodes[i].start){
                    res++;
                    ok2=ok1;
                    ok1=nodes[i].end;
                }else if(ok1<=nodes[i].end && ok2>=nodes[i].start){
                    continue;
                }
            }
            System.out.println(res);
        }
    }
}



