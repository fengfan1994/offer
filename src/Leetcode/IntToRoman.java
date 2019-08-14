package Leetcode;

import java.util.HashMap;
import java.util.HashSet;

//将数字转化为罗马字符
public class IntToRoman {
    public String intToRoman(int num){
        HashSet set=new HashSet();
      return null;
    }

    //从尾到头进行换算
    //MCMXCIV  1994
    public int RomanToInt(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int res = 0, level = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int num = map.get(s.charAt(i));
            if (num >= level)
                res += num;
            else res -= num;
            level = num;
        }
        return res;
    }
}
