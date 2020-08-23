package Leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DeleteDuplicationNum {
    public static void main(String[] args) {
        int[] nums={0,0,1,1,1,2,2,3,3,4};
        int result=(new DeleteDuplicationNum().deleteValueNum(nums,1));
        System.out.println(result);
    }
    //删除排序数组中的重复数字
    public int[] deleteNum(int[] nums){
        if(nums.length==0){
            return null;
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return nums;
    }

    public int deleteValueNum(int[] nums,int val){
        int i = 0;
        int n = nums.length;
        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n - 1];
                // reduce array size by one
                n--;
            } else {
                i++;
            }
        }
        return n;
    }

    public static void swap(int[] nums,int index1,int index2){
        int temp=nums[index2];
        nums[index2]=nums[index1];
        nums[index1]=temp;
    }

    //砝码质量种类
    public static int fama(int n,int[] weight,int[] nums){
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i <= nums[0]; i++){
            set.add(weight[0] * i);
        }
        for(int i = 1; i < n; i++){
            List<Integer> list = new ArrayList<Integer>(set);
            for(int j = 0; j <= nums[i]; j++){
                for(int k = 0; k < list.size(); k++){
                    set.add(list.get(k) + j * weight[i]);
                }
            }
        }
        return set.size();
    }
}
