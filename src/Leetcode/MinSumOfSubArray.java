package Leetcode;
//将一个数组切分m次后，子数组最大和的最小值
public class MinSumOfSubArray {
    public static int BinarySearch(int[] arr,int left,int right,int n,int m){
        int mid=0;
        while(left<right){
            mid=(left+right)/2;
            if(judge(arr,mid,m,n)==1){
                left=mid+1;
            }else {
                right=mid;
            }
        }
        return left;
    }

    public static int judge(int[] arr,int mid,int m,int n){
        int sum=0;
        int count=0;
        for(int i=0;i<n;i++){
            if(sum+arr[i]>mid){
                sum=arr[i];
                count++;
            }else {
                sum+=arr[i];
            }
        }
        if(count>=m){
            return 1;
        }else {
            return 0;
        }
    }

    //基于动态规划
    public int getResult(int[] arr,int n,int m){
        int[][] dp=new int[n][m];
        for(int i=1;i<n;i++){
            dp[i][1]=dp[i-1][1]+arr[i];
        }
        for(int i=1;i<=n;i++){
            for(int j=2;j<=m;j++){
                int min=999999;
                for(int k=1;k<=i;k++){
                    int temp=Math.max(dp[i][1]-dp[k][1],dp[k][j-1]);
                    if(temp<min){
                        temp=min;
                    }
                }
                dp[i][j]=min;
            }
        }
        return dp[n-1][m-1];
    }
}
