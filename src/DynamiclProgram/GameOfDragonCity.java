package DynamiclProgram;
//龙与地下城游戏
public class GameOfDragonCity {
    public static int minHP(int[][] m){
        if(m==null|| m.length==0 ||m[0].length==0){
            return -1;
        }
        int row=m.length;
        int col=m[0].length;
        int[][] dp=new int[row--][col--];
        dp[row][col]=m[row][col]>0 ?1:-m[row][col]+1;
        for(int j=col-1;j>=0;j--){
            dp[row][j]=Math.max(dp[row][j+1]-m[row][j],1);
        }
        for(int j=row-1;j>=0;j--){
            dp[j][col]=Math.max(dp[j+1][col]-m[j][col],1);
        }
        int right=0;
        int down=0;
        for(int i=row-1;i>=0;i--){
            for(int j=col-1;j>=0;j--){
                right=Math.max(dp[i][j+1]-m[i][j],1);
                down=Math.max(dp[i+1][j]-m[i][j],1);
                dp[i][j]=Math.min(right,down);
            }
        }
        for(int i=0;i<=row;i++){
            for(int j=0;j<=col;j++){
                System.out.println(dp[i][j]+" ");
            }
        }
        return dp[0][0];
    }

    public static void main(String[] args) {
        int[][] m={{-2,-3,3},{-5,-10,1},{0,30,-5}};
        System.out.println(minHP(m));
    }
}
