package NiuKe.Basement.chapter01;
//给定一个数组，求如果排序之后，相邻两数的最大差值，时间复杂度O（N）
public class MaxGap {
    public static int maxGap(int[] nums){
        if(nums==null || nums.length<2){
            return 0;
        }
        int len=nums.length;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        //找出数组中的最大值和最小值
        for(int i=0;i<len;i++){
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }
        if(max==min){
            return 0;
        }
        //将所有数划分到n+1个桶中，每个桶只存放进入的最大值或者最小值，然后寻找每个同最近的非空桶值，进行比较
        boolean[] hasNum=new boolean[len+1];
        int[] maxs=new int[len+1];
        int[] mins=new int[len+1];
        int bid=0;
        //将不同的数据划分到不同的桶元,每一个桶元只保留最大值和最小值
        for(int i=0;i<len;i++){
            bid=bucket(nums[i],len,min,max);
            mins[bid]=hasNum[bid] ? Math.min(mins[bid],nums[i]):nums[i];
            maxs[bid]=hasNum[bid] ? Math.max(maxs[bid],nums[i]):nums[i];
            hasNum[bid]=true;
        }
        int res=0;
        int lastMax=maxs[0];
        int i=1;
        for(;i<=len;i++){
            if(hasNum[i]){
                res=Math.max(res,mins[i]-lastMax);
                lastMax=maxs[i];
            }
        }
        return res;
    }

    public static int bucket(long num,long len,long min,long max){
        return (int)((num-min)*len/(max-min));
    }
}
