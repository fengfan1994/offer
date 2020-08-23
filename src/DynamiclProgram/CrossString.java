package DynamiclProgram;

public class CrossString {
    public boolean isValid(String s1,String s2,String aim){
        int m=s1.length();
        int n=s2.length();
        int len=aim.length();
        if(m+n!=len){
            return false;
        }
        char[] ch1=s1.toCharArray();
        char[] ch2=s2.toCharArray();
        char[] ch3=aim.toCharArray();
        boolean[][] dp=new boolean[m+1][n+1];
        dp[0][0]=true;
        for(int i=1;i<=m;i++){
            if(ch1[i-1]!=ch3[i-1]){
                break;
            }
            dp[i][0]=true;
        }
        return false;
    }
}
