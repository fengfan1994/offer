package Test;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.*;

public class Test7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String s=sc.nextLine();
            System.out.println(getRes(s));
        }
    }

    public static int getRes(String s){
        if(s==null || s.length()==0){
            return 0;
        }
        if(s.length()==1){
            return 1;
        }
        int len=s.length();
        int[] dp=new int[len];
        dp[len-1]=1;
        for(int i=len-2;i>=0;i--){
            dp[i]=dp[i+1]+1;
            for(int j=i+2;j<=len;j++){
                if(isValid(s.substring(i,j))){
                    dp[i]++;
                }
            }
        }
        return dp[0];
    }

    public static boolean isValid(String s){
        int start=0,end=s.length()-1;
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

}
