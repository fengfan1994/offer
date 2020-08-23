package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//寻找一个string数组中所有的异名词，并分组
public class Anagrams {
    public ArrayList<String> anagrams(String[] strs){
        ArrayList<String> result=new ArrayList<>();
        Map<String,ArrayList<String>> map=new HashMap<>();
        for(String s:strs){
            String key=sortString(s);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<String>());
            }
            map.get(key).add(s);
        }
        return result;
    }

    public String sortString(String s){
        char[] arr=s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}
