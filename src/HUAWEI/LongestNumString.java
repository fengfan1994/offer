package HUAWEI;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

//输出字符串序列中最长的数字字符串
public class LongestNumString {
    public static void printString(String s){
        int max=0;
        int num=0;
        List<String> list=new ArrayList<>();
        int length=s.length();
        for(int i=0;i<length;i++){
            if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
                num++;
                if(num>max){
                    max=num;
                }
            }else{
                num=0;
            }
        }
        for(String temp:list){
            if(temp.length()==max){
                System.out.print(temp);
            }
        }
        System.out.print(","+max);
    }

    public static void getResult(String target){
        char[] ch=target.toCharArray();
        int len=ch.length;
        int maxLength=0;
        int begin=0,end=0;
        List<String> list=new ArrayList<>();
        while(end<len && begin<len){
            if(ch[end]>='0' && ch[end]<='9'){
                begin=end;
                while(  (end+1)<len && ch[end+1]>='0' && ch[end+1]<='9'){
                    end++;
                }
                list.add(target.substring(begin,end+1));
                if(maxLength<(end-begin+1)){
                    maxLength=end-begin+1;
                }
                begin=end=(++end);
            }else{
                begin++;
                end++;
            }
        }
        for(String temp:list){
            if(temp.length()==maxLength){
                System.out.print(temp);
            }
        }
        System.out.println(","+maxLength);
    }

    public static void main(String[] args){
       getResult("1234asd5678");
    }
}
