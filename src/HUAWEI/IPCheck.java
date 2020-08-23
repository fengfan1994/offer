package HUAWEI;
import java.util.*;

public class IPCheck {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String s=sc.next();
            System.out.println(getResult(s));
        }

    }

    public static String getResult(String s){
        if(s.contains(" ")){
            return "NO";
        }
        String[] strs=s.split("\\.");
        for(String str:strs){
            System.out.println(str);
            int temp=Integer.parseInt(str);
            if(temp>255 || temp<0){
                return "NO";
            }
        }
        return "YES";
    }
}
