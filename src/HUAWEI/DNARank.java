package HUAWEI;

import java.util.ArrayList;
import java.util.*;

public class DNARank {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String s=sc.next();
            int num=sc.nextInt();
            getResult(s,num);
        }
    }

    public static void getResult(String s,int num){
        if(s.length()<=num){
            System.out.println(s);
            return;
        }
        int max=0;
        int count=0;
        LinkedList<String> list=new LinkedList<>();
        for(int i=0;i<s.length()-num;i++){
            count=getNum(s.substring(i,i+num));
            if(max<count){
                max=count;
                list.addLast(s.substring(i,i+num));
            }
        }
        while(!list.isEmpty()){
            String temp=list.peekFirst();
            if(getNum(temp)==max){
                System.out.println(temp);
                break;
            }else{
                list.pollFirst();
            }
        }
    }

    public static int getNum(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='G' || s.charAt(i)=='C' ){
                count++;
            }
        }
        return count;
    }
}
