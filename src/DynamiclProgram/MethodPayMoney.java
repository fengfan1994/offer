package DynamiclProgram;
//换钱的方法数
public class MethodPayMoney {
    //时间复杂度O(N*aim^2)
    public int getCoin1(int[] arr,int aim){
        if(arr==null || arr.length==0 || aim<0){
            return 0;
        }
        int n=arr.length;
        int[][] dp=new int[n][aim+1];
        for(int i=0;i<n;i++){
            dp[i][0]=1;
        }
        for(int j=1;arr[0]*j<=aim;j++){
            dp[0][arr[0]*j]=1;
        }
        int num=0;
        for(int i=1;i<n;i++){
            for(int j=1;j<=aim;j++){
                num=0;
                for(int k=0;j-k*arr[i]>0;k++){
                    num+=dp[i-1][j-arr[i]*k];
                }
                dp[i][j]=num;
            }
        }
        return dp[n-1][aim];
    }

    //时间复杂度O(N*aim)
    public int getCoin2(int[] arr,int aim){
        if(arr==null || arr.length==0 || aim<0){
            return 0;
        }
        int n=arr.length;
        int[][] dp=new int[n][aim+1];
        for(int i=0;i<n;i++){
            dp[i][0]=1;
        }
        for(int j=1;arr[0]*j<=aim;j++){
            dp[0][arr[0]*j]=1;
        }
        int num=0;
        for(int i=1;i<n;i++){
            for(int j=1;j<=aim;j++){
               dp[i][j]=dp[i-1][j];
               dp[i][j]+=j-arr[i]>=0?dp[i][j-arr[i]]:0;
            }
        }
        return dp[n-1][aim];
    }
}
