package Test;

import java.util.*;

public class Test1{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int x=sc.nextInt();
            int[] weight={3,5,7};
            System.out.println(getRes(weight,x));
        }
    }

    public static int getRes(int[] weight,int x){
        int[][] dp=new int[3][x+1];
        int max=Integer.MAX_VALUE;
        for(int i=1;i<=x;i++){
            dp[0][i]=max;
            if(i-weight[0]>=0 && dp[0][i-weight[0]]!=max){
                dp[0][i]=dp[0][i-weight[0]]+1;
            }
        }
        int left=0;
        for(int i=1;i<weight.length;i++){
            for(int j=1;j<=x;j++){
                left=max;
                if(j-weight[i]>=0 && dp[i][j-weight[i]]!=max) left=dp[i][j-weight[i]]+1;
                dp[i][j]=Math.min(dp[i-1][j],left);
            }
        }
        return dp[2][x]==max?-1:dp[2][x];
    }
}

