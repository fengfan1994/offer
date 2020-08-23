package Test;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int total=sc.nextInt();
            System.out.println(getResult(total));;
        }
    }

    public static int getResult(int n){
        if(n==0){
            return 1;
        }
        int[] arr={1,5,10,20,50};
        int[][] dp=new int[5][n+1];
        for(int i=0;i<5;i++){
            dp[i][0]=1;
        }
        for(int i=0;i<=n;i++){
            dp[0][i]=1;
        }
        for(int i=1;i<5;i++){
            for(int j=1;j<=n;j++){
                int num=0;
                for(int k=0;j-arr[i]*k>=0;k++){
                    num+=dp[i-1][j-arr[i]*k];
                }
                dp[i][j]=num;
            }
        }
        for(int i=0;i<5;i++){
            for(int j=0;j<n;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        return dp[4][n];

    }


}
