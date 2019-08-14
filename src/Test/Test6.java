package Test;

import java.util.HashMap;
import java.util.*;

public class Test6 {


    public static void main(String[]args)
    {
        Scanner scanner=new Scanner(System.in);
        int m=Integer.valueOf(scanner.nextLine());
        String[]subStrs=new String[m];
        Map<String,Integer>subStrMap=new HashMap<String, Integer>();
        Map<Integer,Integer>strLen=new HashMap<Integer, Integer>();
        int minLen=Integer.MAX_VALUE;
        for(int i=0;i<m;i++)
        {
            subStrs[i]=scanner.nextLine();//会读进去一个换行
            int len=subStrs[i].length();
            subStrMap.put(subStrs[i],i);
            strLen.put(len,1);
            if(len<minLen)
            {
                minLen=len;
            }
        }
        String str=scanner.nextLine();
        int []dp=new int[str.length()+1];
        int [][]flags=new int[str.length()+1][m];
        //flag是1表示放进去了啊
        Set<Integer>set=strLen.keySet();
        for(int i=minLen;i<=str.length();i++)
        {
            dp[i]=dp[i-1];
            for(int j:set)
            {
                if(j>i)
                {
                    continue;
                }
                if(dp[i]<dp[i-j]+1  && subStrMap.get(str.substring(i-j,i))!=null)
                {
                    dp[i]=dp[i-j]+1;
                }
            }
        }
        System.out.println(dp[str.length()]);
    }

}
