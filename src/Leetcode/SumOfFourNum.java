package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class SumOfFourNum {
    public ArrayList<ArrayList<Integer>> fourSum(int[] num, int target) {
        ArrayList<ArrayList<Integer>> lists=new ArrayList<>();
        if(num==null || num.length==0){
            return lists;
        }
        Arrays.sort(num);
        for(int i=0;i<num.length-1;i++){
            if(i!=0 && num[i]==num[i-1]){
                continue;
            }
            for(int j=i+1;j<num.length;j++){
                if(j!=i+1 && num[j]==num[j-1]){
                    continue;
                }
                int left=j+1,right=num.length-1;
                int sum=target-num[i]-num[j];
                while(left<right){
                    if(num[left]+num[right]<sum){
                        left++;
                    }else if(num[left] +num[right]>sum){
                        right--;
                    }else{
                        ArrayList<Integer> list=new ArrayList<>();
                        list.add(num[i]);
                        list.add(num[j]);
                        list.add(num[left]);
                        list.add(num[right]);
                        lists.add(list);
                        left++;
                        right--;
                        while(left<right && num[left]==num[left-1]){
                            left++;
                        }
                        while(left<right && num[right]==num[right+1]){
                            right--;
                        }
                    }
                }
            }
        }
        return lists;
    }
}
