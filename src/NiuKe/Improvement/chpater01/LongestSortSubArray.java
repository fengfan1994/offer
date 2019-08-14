package NiuKe.Improvement.chpater01;

import java.util.HashSet;

//最长可整合字数组的长度
public class LongestSortSubArray {
    public int getLIL(int[] arr){
        if(arr==null || arr.length==0){
            return 0;
        }
        int len=0;
        int max=0;
        int min=0;
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            max=Integer.MIN_VALUE;
            min=Integer.MAX_VALUE;
            for(int j=i;j<arr.length;j++){
                if(hs.contains(arr[j])){
                    break;
                }
                hs.add(arr[j]);
                max=Math.max(max,arr[j]);
                min=Math.min(min,arr[j]);
                if(max-min==(j-i)){
                    len=Math.max(len,j-i+1);
                }
            }
            hs.clear();
        }
        return len;
    }
}
