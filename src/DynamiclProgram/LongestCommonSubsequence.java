package DynamiclProgram;

import java.util.Scanner;

public class LongestCommonSubsequence {

    //最长公共子序列
    public static int findLCS1(String A, int n, String B, int m) {
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                dp[i][j] = 0;
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (A.charAt(i - 1) == B.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j] , dp[i][j - 1]) ;
                }
            }
        }
        return dp[n][m];
    }

    //最长公共子串
    public static void findLCS2(String s1, String s2) {
        String s=(s1.length()<s2.length())?s1:s2;
        String l=(s1.length()>s2.length())?s1:s2;
        int m=s.length();
        int n=l.length();
        int[][] dp=new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                dp[i][j]=0;
            }
        }
        String result="";
        int max=0;
        for(int i=1;i<=m;i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = 0;
                }
                if (dp[i][j] > max) {
                    max = dp[i][j];
                    result = s.substring(i - max, i);
                }
            }
        }
        System.out.println(result);
    }

    //最长递增子序列,以dp[i]标识以第i个字母位结尾的最长递增序列长度
    public static int getLongestIncreaseSubString(String target){
        int[] dp=new int[target.length()];
        dp[0]=1;
        int max=0;
        for(int i=1;i<target.length();i++){
            max=0;
            for(int j=0;j<i;j++){
                if(target.charAt(i)>target.charAt(j)){
                    max=Math.max(dp[j]+1,max);
                }else{
                    max=Math.max(1,max);
                }
            }
            dp[i]=max;
        }

        return dp[target.length()-1];
    }

    public static void main(String[] args) {
        getLongestIncreaseSubString("215364897");
    }
}
