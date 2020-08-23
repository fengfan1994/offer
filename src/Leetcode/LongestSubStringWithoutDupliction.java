package Leetcode;

import java.util.HashSet;
import java.util.Set;
//基于滑动窗口思想
public class LongestSubStringWithoutDupliction {
    public static int lenOfSubstring(String s){
        int length=s.length();
        Set<Character> set=new HashSet<>();
        int ans=0,i=0,j=0;
        while(i<length && j<length){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans=Math.max(ans,j-i);
            }else{
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(lenOfSubstring("abcd"));
    }
}
