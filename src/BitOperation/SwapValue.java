package BitOperation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

//使用位运算交换两个数的值
public class SwapValue {
    /*
    public static void main(String[] args) {
        int a=3;
        int b=5;
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a+" "+b);
    } */
    public static void main(String[] args) {
        int[] arr={4,5,1,6,2,7,3,8};
        get(arr);
    }

    public static ArrayList<Integer> get(int[] input){
        PriorityQueue<Integer> pq=new PriorityQueue<>(4, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        for(int i=0;i<4;i++){
            pq.add(input[i]);
        }
        for(int i=4;i<input.length;i++){
            int max=pq.peek();
            if(input[4]<max){
                pq.poll();
                pq.add(input[4]);
            }
        }
        ArrayList<Integer> list=new ArrayList<>();
        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            list.add(pq.poll());
        }
        return list;
    }
}
