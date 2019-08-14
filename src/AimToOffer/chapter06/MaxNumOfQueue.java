package AimToOffer.chapter06;

import java.util.*;

public  class MaxNumOfQueue{
    public LinkedList<Integer> maxNumOfQueue(int[] nums, int length){
        //用来保存每个窗口的最大值
        LinkedList<Integer> list=new LinkedList<>();
        //用来保存当前窗口最大的两个值
        ArrayDeque<Integer> deque=new ArrayDeque<>();
        for(int i=0;i<length;i++){
            while(!deque.isEmpty() && nums[i]>=nums[deque.peekLast()]){
                deque.pollLast();
            }
            deque.addLast(i);
        }

        for(int i=length;i<nums.length;i++){
            list.addLast(nums[deque.peekFirst()]);
            while(!deque.isEmpty() && nums[i]>=nums[deque.peekLast()]){
                deque.pollLast();
            }
            if(!deque.isEmpty() && deque.peekFirst()<=(i-length)){
                deque.pollFirst();
            }
            deque.addLast(i);
        }
        list.addLast(nums[deque.peekFirst()]);
        for(int i:list){
            System.out.print(i+" ");
        }
        return list;
    }


    public static int[] getMaxWindow(int[] arr,int w){
        if(arr==null || arr.length==0 || w<1){
            return null;
        }
        LinkedList<Integer> list=new LinkedList<>();
        //用来保存结果集合
        int[] res=new int[arr.length-w+1];
        int index=0;
        for(int i=0;i<arr.length;i++){
            while(!list.isEmpty() && arr[i]>=arr[list.peekLast()]){
                list.pollLast();
            }
            list.addLast(i);

            //查看数字是否还在窗口内
            if(list.peekFirst()==i-w){
                list.pollFirst();
            }
            if(i>=w-1){
                res[index++]=arr[list.peekFirst()];
            }
        }
        System.out.println(res);
        return res;
    }

    public static void main(String[] args){
        int[] nums={2,3,4,2,6,2,5,1};
        int[] res=getMaxWindow(nums,3);
        for(int i:res){
            System.out.print(i+" ");
        }
    }
}
