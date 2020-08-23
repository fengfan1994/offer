package HUAWEI;

import java.util.Scanner;

public class ReverseSentence {
    public String reverse(String sentence){
        String result="";
        String[] strs=sentence.split(" ");
        int len=strs.length;
        for(int i=len-1;i>=0;i--){
            if(i==0){
                result=result+strs[i];
            }else{
                result=result+strs[i]+" ";
            }
        }
        return result;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ReverseSentence m=new ReverseSentence();
        while(sc.hasNext()){
            String s=sc.nextLine();
            System.out.println(m.reverse(s));
        }
    }

}
