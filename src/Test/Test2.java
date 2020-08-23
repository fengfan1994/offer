package Test;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



public class Test2 {
    public static void main(String[] args) {
        char c='{';
        char d='{';
        System.out.println(c==d);
    }

    public boolean isValid(String s) {
        if(s==null || s.length()==0){
            return true;
        }
        int len=s.length();
        if(len %2 !=0){
            return false;
        }
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i=i+2){
            if(ch[i]=='(' && ch[i+1]!=')'){
                return false;
            }
            if(ch[i]=='[' && ch[i+1]!=']'){
                return false;
            }
            if(ch[i]=='{' && ch[i+1]!='}'){
                return false;
            }
        }
        return true;
    }
}
