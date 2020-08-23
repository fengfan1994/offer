package xiaozhao2018;
//奶牛逃离农场问题
public class EscapeFarm {
    public int getCount1(int n,int k){
        //基于三维动态数组
        int[][][] dp=new int[n][k][n];
        dp[0][1][0]=dp[0][0][0]=1;
        for(int i=1;i<n;i++){
            for(int  j=0;j<=Math.min(i+1,k);j++){
                for(int t=0;t<n;t++){
                    if(j>0){
                        dp[i][j][t]=dp[i-1][j][t]+dp[i-1][j-1][(t+n-i)%n];
                    }else{
                        if(t==0){
                            dp[i][j][t]=1;
                        }
                    }
                }
            }
        }
        return dp[n-1][k][0];
    }

    //同样的思想优化到二维
    public int getCount2(int n,int k){
        int[][] dp=new int[k][n];
        dp[1][0]=dp[0][0]=1;
        for(int i=1;i<n;i++){
            for(int j=Math.min(k,i+1);j>0;j--){
                for(int t=0;t<n;t++){
                    dp[j][t]=dp[j][t]+dp[j-1][(t+n-i)%n];
                }
            }
        }
        return dp[k][0];
    }
}
