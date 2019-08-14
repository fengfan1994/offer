package AimToOffer.chapter05;

public class NumToString {
    int getTranslationCount(String s){
      if(s==null || s.length()==0){
          return 0;
      }
      int len=s.length();
      int[] dp=new int[len+1];
      dp[0]=1;
      dp[1]=s.charAt(0)!='0'?1:0;
      for(int i=2;i<=len;i++){
          int first=Integer.valueOf(s.substring(i-1,i));
          int second=Integer.valueOf(s.substring(i-2,i));
          if(first>=1 && first<=9){
              dp[i]=dp[i]+dp[i-1];
          }
          if(second>=10 && second<=26){
              dp[i]=dp[i]+dp[i-2];
          }
          System.out.println(dp[i]);
      }
      return dp[len];
    }

    public static void main(String[] args){
        new NumToString().getTranslationCount("12258");
    }
}
