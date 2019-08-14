package HUAWEI;

import java.util.*;

public class FirstLetterOnce {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String target=sc.next();
            getResult(target);
        }
    }
    //得到字符串中第一个只出现一次的字符，也可以使用lastIndexOf()方法
    public static void getResult(String target){
        char[] ch=target.toCharArray();
        LinkedHashMap<Character,Integer> hs=new LinkedHashMap<>();
        for(int i=0;i<ch.length;i++){

            if(hs.containsKey(ch[i])){
                hs.put(ch[i],hs.get(ch[i])+1);
            }else{
                hs.put(ch[i],1);
            }
        }
        int size=hs.size();
        for(char c:hs.keySet()){
            if(hs.get(c)==1){
                System.out.println(c);
                break;
            }else {
                size--;
            }
        }
        if(size==0){
            System.out.println(-1);
        }
    }
}
