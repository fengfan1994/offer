package DynamiclProgram;

public class MinEditCost {
    //将两个字母转化成同一个字母所需的最小编辑次数
    public static int findMinCost(String s1,String s2){
        int n=s1.length();
        int m=s2.length();
        int[][] dp=new int[n+1][m+1];
        for(int i=0;i<=n;i++){
            dp[i][0]=i;
        }
        for(int j=0;j<=m;j++){
            dp[0][j]=j;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                int flag;
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    flag=0;
                }else{
                    flag=1;
                }
                dp[i][j]=Math.min(dp[i-1][j-1]+flag,Math.min(dp[i][j-1]+1,dp[i-1][j]+1));
            }
        }
        return dp[n][m];
    }
}
