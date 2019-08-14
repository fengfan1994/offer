package NiuKe.Improvement.chpater01;

import java.util.HashMap;

//未排序数组中累加和位指定值的最长子数组长度
public class TargetLongestSubArray {
    public int getMaxLength(int[] arr,int k){
        if(arr==null || arr.length==0 || k<0){
            return 0;
        }
        int left=0;
        int right=0;
        int len=0;
        int sum=arr[0];
        while(right<arr.length){
            if(sum==k){
                len=Math.max(len,right-left+1);
                sum-=arr[left++];
            }else if(sum<k){
                right++;
                if(right==arr.length){
                    break;
                }
                sum+=arr[right];
            }else{
                sum-=arr[left--];
            }
        }
        return len;
    }

    public int getMaxlength2(int[] arr,int k){
        if(arr==null||arr.length==0){
            return 0;
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int len=0;
        int sum=0;
        for(int i=0;i!=arr.length;i++){
            sum+=arr[i];
            if(map.containsKey(sum-k)){
                len=Math.max(i-map.get(sum-k),len);
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return len;
    }
}
