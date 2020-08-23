package DynamiclProgram;
//添加最少字符使字符串整体成为回文字符串
public class GetPalidrome {
    //最少需要添加字符数目
    public  int[][] getDp(char[] str){
        int[][] dp=new int[str.length][str.length];
        for(int j=1;j<str.length;j++){
            dp[j-1][j]=str[j-1]==str[j]?1:0;
            for(int i=j-2;i>-1;i--){
                if(str[i]==str[j]){
                    dp[i][j]=dp[i+1][j-1];
                }else{
                    dp[i][j]=Math.min(dp[i+1][j],dp[i][j-1])+1;
                }
            }
        }
        return dp;
    }

    public String getPalidrome(String str){
        if(str==null || str.length()<2){
            return str;
        }
        char[] chs=str.toCharArray();
        int[][] dp=getDp(chs);
        char[] res=new char[dp[0][chs.length-1]+chs.length];
        int i=0,j=chs.length-1;
        int resl=0,resr=res.length-1;
        while(i<=j){
            if(chs[i]==chs[j]){
                res[resl++]=chs[i++];
                res[resr--]=chs[j--];
            }else if(dp[i][j-1]<dp[i+1][j]){
                res[resl++]=chs[j];
                res[resr--]=chs[j--];
            }else {
                res[resl++]=chs[i];
                res[resr--]=chs[i++];
            }
        }
        return String.valueOf(res);
    }
}
