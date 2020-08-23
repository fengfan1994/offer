package StringMath;

public class MatchString {
    //regular-matching
    // *匹配0到n次 *前面的字符串
    public boolean match(char[] str, char[] pattern)
    {
        boolean[][] dp = new boolean[str.length + 1][pattern.length + 1];
        dp[0][0] = true;
        for (int i = 1; i < dp[0].length; i ++) {
            if(pattern[i - 1] == '*') dp[0][i] = dp[0][i - 2];
        }
        for (int i = 1; i < dp.length; i ++) {
            for (int j = 1; j < dp[0].length; j ++) {
                if(pattern[j - 1] == '.' || pattern[j - 1] == str[i - 1]) dp[i][j] = dp[i - 1][j - 1];
                else if(pattern[j - 1] == '*') {
                    if(pattern[j - 2] != str[i - 1] && pattern[j - 2] != '.') dp[i][j] = dp[i][j - 2];
                    else dp[i][j] = dp[i][j - 1] || dp[i][j - 2] || dp[i - 1][j];
                }
            }
        }
        return dp[str.length][pattern.length];
    }

    //wild-matching
    // *可以匹配所有的字符串（包含空字符串）
    public boolean isMatch2(String s, String p) {
        int row = s.length();
        int col = p.length();
        boolean[][] dp = new boolean[row + 1][col + 1];
        dp[0][0] = true;
        for (int j = 1; j < col + 1; j++) {
            if (dp[0][j - 1]) {
                if (p.charAt(j - 1) == '*')
                    dp[0][j] = true;
                else
                    break;
            }
        }
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++) {
                if (p.charAt(j) == s.charAt(i) || p.charAt(j) == '?')
                    dp[i + 1][j + 1] = dp[i][j];
                else if (p.charAt(j) == '*') {
                    dp[i + 1][j + 1] = dp[i][j] || dp[i + 1][j] || dp[i][j + 1];
                }
            }

        return dp[row][col];
    }
}
