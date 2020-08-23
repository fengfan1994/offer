package BackRrack;

public class UniquePath {
    public int uniquePathsWithObstacles(int[][] m) {
        int row=m.length;
        int col=m[0].length;
        int[][] dp=new int[row][col];
        if(m[0][0]==1){
            return 0;
        }
        dp[0][0]=1;
        for(int i=1;i<row;i++){
            if(m[i][0]==1 ){
                break;
            }else{
                dp[i][0]=1;
            }
        }
        for(int i=1;i<col;i++){
            if(m[0][i]==1){
                break;
            }else{
                dp[0][i]=1;
            }
        }
        for(int i=1;i<row;i++){
            for(int j=1;j<col;j++){
                if(m[i][j]==1){
                    dp[i][j]=0;
                }else{
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
                }
            }
        }
        return dp[row-1][col-1];
    }
}
