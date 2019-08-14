package BackRrack;

import java.util.ArrayList;
import java.util.Arrays;

public class CombinationSum {
    ArrayList<ArrayList<Integer>> lists1=new ArrayList<>();
    public ArrayList<ArrayList<Integer>> getResult1(int n,int k){
        ArrayList<Integer> list=new ArrayList<>();
        backtracking(n,k,1,list);
        return lists1;
    }

    public void backtracking(int n,int k,int start,ArrayList<Integer> list){
        if(k<0){
            return;
        }
        if(k==0){
            lists1.add(new ArrayList<Integer>(list));
        }else{
            for(int i=start;i<=n;i++){
                list.add(i);
                backtracking(n,k-1,i+1,list);
                list.remove(list.size()-1);
            }
        }
    }

    ArrayList<ArrayList<Integer>> lists2=new ArrayList<>();

    public ArrayList<ArrayList<Integer>> getResult2(int[] candidates,int target){
        Arrays.sort(candidates);
        ArrayList<Integer> list=new ArrayList<>();
        backtracking1(candidates,target,0,list);
        return lists2;
    }

    public void backtracking1(int[] candidates,int k,int start,ArrayList<Integer> list){
        if(k<0){
            return;
        }
        if(k==0){
            lists2.add(new ArrayList<Integer>( list));
        }else{
            for(int i=start;i<candidates.length;i++){
                list.add(candidates[i]);
                backtracking1(candidates,k-candidates[i],i,list);
                list.remove(list.size()-1);
            }
        }
    }
}
