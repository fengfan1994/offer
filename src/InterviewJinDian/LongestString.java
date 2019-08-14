package InterviewJinDian;
import java.util.*;

//由数组中字符能够合成的最长字符串
public class LongestString {
    static int max=Integer.MIN_VALUE;

    public static void main(String[] args) {
        String[] strs={"a","b","c","ab","bc","abc"};
        int res=new LongestString().getLongest(strs,6);
        System.out.println(res);
    }

    public int getLongest(String[] str, int n) {
        // write code here
        if(str==null || str.length==0){
            return 0;
        }
        HashSet<String> hs=new HashSet<>();
        for(int i=0;i<str.length;i++){
            hs.add(str[i]);
        }
        for(int i=0;i<str.length;i++){
            max=Math.max(max,getRes(str,str[i],hs));
        }
        return max;
    }

    public static int getRes(String[] str,String s,HashSet<String> hs){
        int maxlen=0,len=0;
        if(s==null || s==""){
            return 0;
        }
        for(int i=0;i<=s.length();i++){
            String temp=s.substring(0,i);
            if(hs.contains(temp)){
                len=getRes(str,s.substring(i),hs)+1;
                maxlen=Math.max(maxlen,len);
            }else{
                continue;
            }

        }
        return maxlen;
    }
}
