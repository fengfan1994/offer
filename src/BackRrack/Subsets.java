package BackRrack;

import Test.Test4;

import java.util.ArrayList;
import java.util.Arrays;

public class Subsets {
    public static void main(String[] args) {
        int[] s={1,2,2};
        new Subsets().subsets(s);
    }
    public ArrayList<ArrayList<Integer>> subsets(int[] nums) {
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<=nums.length;i++){
            backtrack(nums,0,i,list,lists);
        }
        for(ArrayList<Integer> L:lists){
            System.out.println(L);
        }
        return lists;
    }

    public void backtrack(int[] nums,int start,int k,ArrayList<Integer> list,
                          ArrayList<ArrayList<Integer>> lists){
        if(k<0){
            return ;
        }
        if(k==0){
            lists.add(new ArrayList<Integer>(list));
        }
        for(int i=start;i<nums.length;i++){
            if(i>start && nums[i]==nums[i-1]){
                continue;
            }
            list.add(nums[i]);
            backtrack(nums,i+1,k-1,list,lists);
            list.remove(list.size()-1);
        }
    }
}
