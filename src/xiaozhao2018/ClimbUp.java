package xiaozhao2018;

import java.util.Scanner;

public class ClimbUp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String s=sc.nextLine();
            String[] strs=s.split(",");
            System.out.println(getRes(strs));;
        }
    }

    public static  int getRes(String[] strs){
        if(strs==null || strs.length==0) return 0;
        if(strs.length==1) return Integer.parseInt(strs[0]);
        int[] cost=new int[strs.length+1];
        for(int i=0;i<strs.length;i++){
            cost[i]=Integer.parseInt(strs[i]);
        }
        cost[strs.length]=0;
        int[] dp=new int[cost.length];
        dp[0]=cost[0];
        dp[1]=cost[1];
        if(cost.length==2){
            return Math.min(dp[0],dp[1]);
        }
        for(int i=2;i<cost.length;i++){
            dp[i]=Math.min(dp[i-1],dp[i-2])+cost[i];
        }
        return dp[cost.length-1];
    }
}
