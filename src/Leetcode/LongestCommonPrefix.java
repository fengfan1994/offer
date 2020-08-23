package Leetcode;

//最长字符串前缀
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length==0){
            return "";
        }
        String prefix=strs[0];
        int cuurrentIndex=0;
        while(cuurrentIndex<strs.length){
            while(!strs[cuurrentIndex].startsWith(prefix)){
                prefix=prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()){
                    return "";
                }
            }
            cuurrentIndex++;
        }
        return prefix;
    }
}
