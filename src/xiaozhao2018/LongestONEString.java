package xiaozhao2018;

import java.util.ArrayList;
import java.util.HashMap;


public class LongestONEString {
    //假设有k次修改字符的机会，求最长连续为1的序列
    public int LongestSubstring(int[] arr,int k){
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                list.add(i);
            }
        }
        if(list.size()<=k){
            return arr.length;
        }
        list.add(arr.length);
        int max=list.get(k);
        for(int i=k+1;i<list.size();i++){
            max=Math.max(max,list.get(i)-list.get(i-k-1)-1);
        }
        return max;

    }

    //最长01子串
    public String longestSubString(String str){
        int len=str.length();
        char[] ch=str.toCharArray();
        int[] dp=new int[len+1];
        dp[1]=(ch[0]-'0')==1?1:-1;
        for(int i=2;i<=len;i++){
            dp[i]=(ch[i-1]-'0')==1?1:-1;
            dp[i]+=dp[i-1];
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        int start=0,end=0,max=0,begin;
        for(int i=1;i<=len;i++){

        }
        return null;
    }
}
