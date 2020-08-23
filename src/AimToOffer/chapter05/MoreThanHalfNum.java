package AimToOffer.chapter05;

import Rank.Selection;

public class MoreThanHalfNum {
    //我能想到的方法,不使用辅助内存
    public int findNum(int[] nums){
        if(nums==null || nums.length==0){
            return 0;
        }
        new Selection().sort(nums);
        return nums[nums.length/2];
    }

    //时间效率为O(n)的算法,使用辅助内存
    public int findNum1(int[] nums){
        int result=nums[0];
        int times=1;
        for(int i=1;i<nums.length;i++){
            if(times==0){
                result=nums[i];
                times=1;
            }else if (nums[i]==result){
                times++;
            }else {
                times--;
            }
        }
        return result;
    }

}
