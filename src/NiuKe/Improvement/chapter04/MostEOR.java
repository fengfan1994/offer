package NiuKe.Improvement.chapter04;

import java.util.HashMap;

//给定一个数组arr，你可以任意把arr分成很多不相容的子数组，你的目的是：
//分出来的子数组中，异或和为0的子数组最多
public class MostEOR {
    public static int mostEOR(int[] arr){
        int ans=0;
        int xor=0;
        int[] mosts=new int[arr.length];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            xor=xor^arr[i];
            if(map.containsKey(xor)){
                int pre=map.get(xor);
                mosts[i]=pre==-1?1:(mosts[pre]+1);
            }
            if(i>0){
                mosts[i]=Math.max(mosts[i-1],mosts[i]);
            }
            map.put(xor,i);
            ans=Math.max(ans,mosts[i]);
        }
        return ans;
    }
}
