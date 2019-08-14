package xiaozhao2018;
import java.util.*;

public class BiggestSubString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String s=sc.next();
            System.out.println(getResults(s));
        }
    }

    public static String getResults(String s){
        if(s.length()==1){
            return s;
        }
        if(s.length()==0){
            return "";
        }
        char max='a';
        int temp=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>=max){
                max=s.charAt(i);
                temp=i;
            }
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==max){
                temp=i;
                break;
            }
        }
        String result=max+"";
        result+=getResults(s.substring(temp+1,s.length()));
        return result;
    }
}
