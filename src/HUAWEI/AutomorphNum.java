package HUAWEI;

import  java.util.*;
public class AutomorphNum {
    //寻找n以内的自守数数目
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            System.out.println(getResult(n));
        }
    }

    public static int getResult(int n){
        int count=2;
        for(int i=2;i<n;i++){
            if(i%10==1 || i%10==5 || i%10==6){
                if(isRight(i)){
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean isRight(int n){
        long l=n*n;
        String s1=n+"";
        String s2=l+"";
        if(s2.endsWith(s1)){
            return true;
        }else{
            return false;
        }
    }
}
