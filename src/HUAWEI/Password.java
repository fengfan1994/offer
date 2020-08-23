package HUAWEI;

import java.util.*;

public class Password {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String s1=sc.next();
            String s2=sc.next();
           getPasswod(s1,s2);
        }
    }
    //加密
    public static void Encrypt(String target){
        char[] ch=target.toCharArray();
        String result="";
        for(int i=0;i<ch.length;i++){
            if(ch[i]>='a' && ch[i]<='z'){
                if(ch[i]=='z'){
                    result+='A';
                }else {
                    result+=(char)(ch[i]-31);
                }
            }else if(ch[i]>='A' && ch[i]<='Z'){
                if(ch[i]=='Z'){
                    result+='a';
                }else{
                    result+=(char)(ch[i]+33);
                }
            }else if(ch[i]>='0' && ch[i]<='9'){
                if(ch[i]=='9'){
                    result+='0';
                }else{
                    result+=(char)(ch[i]+1);
                }
            }else{
                result+=ch[i];
            }
        }
        System.out.println(result);
    }
    //解密
    public static void unEncrypt(String target){
        char[] ch=target.toCharArray();
        String result="";
        for(int i=0;i<ch.length;i++){
            if(ch[i]>='a' && ch[i]<='z'){
                if(ch[i]=='a'){
                    result+='Z';
                }else {
                    result+=(char)(ch[i]-33);
                }
            }else if(ch[i]>='A' && ch[i]<='Z'){
                if(ch[i]=='A'){
                    result+='z';
                }else{
                    result+=(char)(ch[i]+31);
                }
            }else if(ch[i]>='0' && ch[i]<='9'){
                if(ch[i]=='0'){
                    result+='9';
                }else{
                    result+=(char)(ch[i]-1);
                }
            }else{
                result+=ch[i];
            }
        }
        System.out.println(result);
    }

    public static void getResult(String s1,String s2){
        String target=s1+s2;
        List<Character> list1=new ArrayList<>();
        List<Character> list2=new ArrayList<>();
        for(int i=0;i<target.length();i++){
            if(i%2==0){
                list1.add(target.charAt(i));
            }else{
                list2.add(target.charAt(i));
            }
        }
        Collections.sort(list1);
        Collections.sort(list2);
        String result="";
        for(int i=0;i<target.length();i++){
            if(i%2==0){
                result+=list1.get(i/2);
            }else{
                result+=list2.get(i/2+1);
            }
        }
        System.out.println(result);
    }

    //根据给定的密钥和明文进行加密
    public static void getPasswod(String key,String s){

    }
}