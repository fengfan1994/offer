package xiaozhao2018;

import java.util.Scanner;

//在字符串末尾添加字符，使其成为回文字符串的最小长度
public class shortestPalidrome {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str=sc.next();
            System.out.println(getShortestString(str));
        }
    }
    public static int getShortestString(String str){
        int len=str.length();
        int res=0;
        for(int i=0;i<len;i++){
            String temp=str.substring(i);
            if(isValid(temp)){
                res=2*len-temp.length();
                return res;
            }
        }
        return 2*len;
    }

    public static boolean isValid(String s){
        if(s==null || s.length()==0 || s.length()==1){
            return true;
        }
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
