package NiuKe.Basement.chapter08;

import java.io.BufferedInputStream;
import java.util.*;

//打印一个字符串的全部子序列，包括空字符串
public class PrintAllSubsequences {
    //
    public static void printAllSub(char[] str, int i, String res,TreeSet<String> set) {
        if (i == str.length) {
            set.add(res);
            return ;
        } else {
            printAllSub(str, i + 1, res,set); // 不要下标为i+1的字符
            printAllSub(str, i + 1, res+str[i],set); // 要第i+1个字符
        }
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(new BufferedInputStream(System.in));
        String str = cin.next();
        TreeSet<String> set=new TreeSet<>();
        printAllSub(str.toCharArray(), 0, "",set);
        for(String s:set){
            System.out.println(s);
        }
        cin.close();
    }

}
