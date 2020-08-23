package AimToOffer.chapter05;

import java.util.Comparator;
import java.util.PriorityQueue;

//得到两个数组的中位数
public class MiddleNumOfTwoArrays {
    public int middleNum(int[] m,int[] n){
        PriorityQueue<Integer> max=new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        PriorityQueue<Integer> min=new PriorityQueue<Integer>();
        if(min.size()<=max.size()){

        }
        return  0;
    }
}
