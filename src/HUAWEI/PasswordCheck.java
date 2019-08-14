package HUAWEI;

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String target=sc.next();
            System.out.println(getPassword(target));
        }
    }
    //判断字符串是否满足规则
    public static boolean isRight(String s){
        if(s.length()<=8){
            return false;
        }
        //2.包括大小写字母.数字.其它符号,以上四种至少三种
        int num=0,low=0,up=0,other=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if('0'<=ch&&ch<='9')
            {
                num=1;
            }
            else if('a'<=ch&&ch<='z')
            {
                low=1;
            }
            else if('A'<=ch&&ch<='Z')
            {
                up=1;
            }
            else
            {
                other=1;
            }
        }
        if((num+other+up+low)<3){
            return false;
        }
        //不能有长度超过2的重复字串
        for(int i=0;i<s.length()-4;i++){
            String temp=s.substring(i,i+3);
            for(int j=i+1;j<s.length()-3;j++){
                if(temp.equals(s.substring(j,j+3))){
                    return false;
                }
            }
        }
        return true;
    }

    //根据规则对对用的密码进行加密
    public static String getPassword(String target){
        String result="";
        for(int i=0;i<target.length();i++){
            int index=2;
            if(target.charAt(i)>='a'&& target.charAt(i)<='z'){
                if(target.charAt(i)<='o'){
                    index=(target.charAt(i)-'a')/3+index;
                    result+=index;
                }else if(target.charAt(i)<='s'){
                    result=result+'7';
                }else if(target.charAt(i)<='v'){
                    result=result+'8';
                }else{
                    result=result+'9';
                }
            }else if(target.charAt(i)>='A'&& target.charAt(i)<='Z'){
                //转化成小写字母
                int ch=target.charAt(i)+32;
                if(ch==122){
                    result+="a";
                }else{
                    result=result+(char)(ch+1);
                }
            }else {
                result+=target.charAt(i);
            }
        }
        return result;
    }
}
