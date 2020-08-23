package BackRrack;

import java.util.ArrayList;
import java.util.HashSet;

public class PossibleSentence {

      static  HashSet<String> set=new HashSet<>();

      static  ArrayList<String> list=new ArrayList<>();


    public static void main(String[] args) {
        set.add("cat");
        set.add("cats");
        set.add("and");
        set.add("sand");
        set.add("dog");
        String s="catsanddog";
        for(int i=0;i<s.length();i++){
            String res=s.substring(0,i);
            if(set.contains(res)){
                System.out.println(res);
                getSentences(s,i,s.length(),res);
            }
        }
        for(String str:list){
            System.out.println(str);
        }
    }

    public static void getSentences(String s,int from ,int to,String res){
        if(from>to){
            return;
        }
        if(from==to){

            list.add(res);
            return;
        }
        for(int i=from;i<to;i++){
            String temp=s.substring(from,i);
            if(set.contains(temp)){
                res=res+" "+temp;
                getSentences(s,i+temp.length(),to,res);
            }
        }
    }
}
