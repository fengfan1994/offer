package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class SumOfTwoNum {
    //暴力求解
    public int[] twoSum(int[] nums,int target){
        int[] a=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    a[0]=i;
                    a[1]=j;
                   break;
                }
            }
        }
        return a;
    }

    //以空间换时间
    public int[] sumOfNum(int[] nums,int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
