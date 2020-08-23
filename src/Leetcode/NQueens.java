package Leetcode;

import java.util.ArrayList;

public class NQueens {
    ArrayList<String[]> list=new ArrayList<>();
    public ArrayList<String[]> solveNQueens(int n) {

        if(n<=0 || n==2 || n==3){
            return list;
        }
        if(n==1){
            list.add(new String[]{"Q"});
            return list;
        }
        int[] record=new int[n];
        process(0,record,n,"");
        return list;
    }

    public void process(int i,int[] record,int n,String s){
        if(i==n){
            String[] strs=new String[n];
            for(int a=0;a<n;a++){
                for(int j=0;j<n;j++){
                    if(j==record[a]){
                        s+="Q";
                    }else{
                        s+=".";
                    }
                }
                strs[a]=s;
                s="";
            }
            list.add(strs);
            return;
        }
        for(int j=0;j<n;j++){
            if(isValid(record,i,j)){
                record[i]=j;
                process(i+1,record,n,s);
            }
        }
    }

    public boolean isValid(int[] record,int i,int j){
        for(int k=0;k<i;k++){
            if(j==record[k] || Math.abs(record[k]-j)==Math.abs(i-k)){
                return false;
            }
        }
        return true;
    }
}
