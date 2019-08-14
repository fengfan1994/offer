package Heap;


import java.util.PriorityQueue;
import java.util.*;

public class PriorityQueueTest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int total=sc.nextInt();
            int k=sc.nextInt();
            int[] nums=new int[total];
            for(int i=0;i<total;i++){
                nums[i]=sc.nextInt();
            }
            getResult(k,nums);
        }
    }

    public static void getResult(int k,int[] nums){
        PriorityQueue<Integer> pq=new PriorityQueue<>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        for(int i=0;i<k;i++){
            pq.offer(nums[i]);
        }
        for(int i=k;i<nums.length;i++){
            if(nums[i]<pq.peek()){
                pq.poll();
                pq.offer(nums[i]);
            }
        }
        int[] num=new int[k];
        int len=k-1;
        while(len>=0){
            num[len]=pq.poll();
            len--;
        }
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
}
