package xiaozhao2018;
//将数组分为和相等的两部分
public class PartionArray {
    public boolean canPartion(int[] nums){
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        sum/=2;
        //dp[i][j]表示能否从nums的前i个数得到j
        boolean[][] dp=new boolean[nums.length+1][sum+1];
        dp[0][0]=true;
        for(int i=1;i<nums.length+1;i++){
            dp[i][0]=true;
        }
        for(int j=1;j<sum+1;j++){
            dp[0][j]=false;
        }
        for(int i=1;i<nums.length+1;i++){
            for (int j=1;j<sum+1;j++){
                dp[i][j]=dp[i-1][j];
                if(j>=nums[i-1]){
                    dp[i][j]=dp[i][j] || dp[i-1][j-nums[i-1]];
                }
            }
        }
        return dp[nums.length][sum];
    }
}
