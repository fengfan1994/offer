package HUAWEI;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;


public class NumberOfLetter {
    //输入一个由字母和数字组成的字符串，输入一个字符，计算字符串中该字符的个数,不区分大小写
    public int numberOfLetter(String target,char c){
        if(target==null || target.length()==0){
            return 0;
        }
        int count=0;
        //65～90为26个大写英文字母，97～122号为26个小写英文字母
        if(c>=65 && c<=90){
            char[] ch=target.toUpperCase().toCharArray();
            for(char k:ch){
                if(k==c){
                    count++;
                }
            }
        }else if(c>=97 && c<=122){
            char[] ch=target.toLowerCase().toCharArray();
            for(char k:ch){
                if(k==c){
                    count++;
                }
            }
        }else{
            char[] ch=target.toCharArray();
            for(char k:ch){
                if(k==c){
                    count++;
                }
            }
        }
        return count;
    }

    //删除字符串中出现次数最少的字符，若有多个字符则全部删除，其它字符顺序保持不变
    //字符串中只有小写字母
    public static String deleteMinString(String target){
        //建立一个数组保存每个小写字母出现的次数
        int[] nums=new int[26];
        LinkedList<Character> list=new LinkedList<>();
        for(int i=0;i<target.length();i++){
            list.addLast(target.charAt(i));
            nums[target.charAt(i)-'a']++;
        }
        //最少出现字母的出现次数
        int min=1000000000;
        for(int i=0;i<26;i++){
            if(nums[i]<min && nums[i]!=0){
                min=nums[i];
            }
        }
        String result="";
        while(!list.isEmpty()){
            char ch=list.pollFirst();
            if(nums[ch-'a']>min ){
                result+=ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String s=sc.nextLine();
            System.out.println(deleteMinString(s));

        }

    }
}
