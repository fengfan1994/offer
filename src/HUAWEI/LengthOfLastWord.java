package HUAWEI;

import java.util.*;

//计算字符串最后一个单词的长度，单词以空格隔开
public class LengthOfLastWord {
    //要消耗O(n)辅助内存，同时要遍历一次字符串，时间效率为O（N），不是一种很好的做法
    public int lenOfLastWord(String s){
        if(s==null || s.length()==0){
            return 0;
        }
        char[] ch=s.toCharArray();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<ch.length;i++){
            if(ch[i]==' '){
                list.add(i);
            }
        }
        return ch.length-list.get(list.size()-1)-1;
    }

    public static int lengthOfLast(String s){
        String[] str=s.split(" ");
        return str[str.length-1].length();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str=sc.nextLine();
            System.out.println(lengthOfLast(str));
        }

    }
}
