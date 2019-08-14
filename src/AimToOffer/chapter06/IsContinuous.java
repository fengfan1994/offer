package AimToOffer.chapter06;

import Rank.Insection;

public class IsContinuous {
    public boolean isContinous(int[] nums){
        //将数组进行排序
        new Insection().sort(nums);
        int numberOfZero=0;
        for(int i:nums ){
            if(i==0){
                numberOfZero++;
            }
        }
        System.out.println(numberOfZero);
        //判断数组中是否有重复元素
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1] && nums[0]!=0){
                return false;
            }
        }
        //数组中总的间隔数
        int total=0;
        if(numberOfZero==0){
            for(int i=1;i<nums.length;i++){
                total=total+(nums[i]-nums[i-1])-1;
            }
        } else if(numberOfZero==1){
            for(int i=2;i<nums.length;i++){
                total=total+(nums[i]-nums[i-1])-1;
            }
        }else{
            for(int i=3;i<nums.length;i++){
                total=total+(nums[i]-nums[i-1])-1;
            }
        }
        System.out.println(total);
        if(total<=numberOfZero){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args){
        int[] nums={0,3,5,7,6};
        System.out.println(new IsContinuous().isContinous(nums));
    }
}
