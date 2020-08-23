package HUAWEI;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SubString {
    //测试空字符
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String shorts=sc.next();
            String longs=sc.next();
            System.out.println(isSubString(shorts,longs));
        }
    }

    //判断一个字符串中的字符是否在另一个字符串中全部出现过
    public static boolean isSubString(String s1,String s2){
        int[] nums=new int[128];

        for(int i=0;i<s1.length();i++){
            nums[s1.charAt(i)]++;
        }
        for(int i=0;i<s2.length();i++){
            if(nums[s2.charAt(i)]>0){
                nums[s2.charAt(i)]--;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                return false;
            }
        }
        return true;
    }

    //寻找两个字符串的最长公共子串，这里默认已经知道了第一个字符串短，第二个字符串长
    public static String longestSunString(String s1,String s2){

       return null;
    }
}
