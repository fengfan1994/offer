package xiaozhao2018;

import java.util.Scanner;

public class DepthOfKuoHao {
    //给定合法括号序列的最大深度
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String s=sc.nextLine();
            System.out.println(getResult(s));
        }
    }

    public static int getResult(String s){
        if(s==null || s.length()==0){
            return 0;
        }
        char[] ch=s.toCharArray();
        int len=1,max=1;
        for(int i=1;i<ch.length;i++){
            if(ch[i]=='(' ){
                len++;
                max=Math.max(len,max);
            }else if(ch[i]==')'){
                len--;
            }
        }
        return max;
    }
}
