package AimToOffer.chapter05;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

//使用最大堆保存最小的K个数字
public class GetLeastNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        PriorityQueue<Integer> pq=new PriorityQueue<>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        for(int i=0;i<k;i++){
            pq.add(sc.nextInt());
        }
        for(int i=k;i<10000;i++){
            if(pq.peek()>sc.nextInt()){
                pq.poll();
                pq.add(sc.nextInt());
            }
        }
    }
}
