package HUAWEI;

import java.util.Scanner;

public class NumOfChar {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        NumOfChar m=new NumOfChar();
        while(sc.hasNext()){
            System.out.println(m.charNum(sc.next()));
        }
    }

    public int charNum(String target){
        int count=0;
        if(target==null || target.length()==0){
            return count;
        }
        for(int i=0;i<target.length();i++){
            if(target.charAt(i)>=0 && target.charAt(i)<=127 ){
                count++;
            }
        }
        return count;
    }
}
