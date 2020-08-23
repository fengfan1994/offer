package Test;
import java.util.*;
public class Test9 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String s=sc.nextLine();
            System.out.println(getResult(s));
        }
    }

    public static String getResult(String s){
        if(s.length()==1){
            return s;
        }
        char[] ch=s.toCharArray();
        int slow=0,fast=1,count=0;
        String res="";
        while(fast<ch.length){
            if(ch[fast]==ch[slow]){
                fast++;
            }else{
                count=fast-slow-1;
                if(count==0){
                    res+=""+ch[slow];
                }else{
                    res+=""+count+ch[slow];
                }
                slow=fast;
                fast++;
            }
            if(fast==ch.length-1){
                if(ch[fast]==ch[slow]){
                    count=fast-slow;
                    res+=""+count+ch[slow];
                }else{
                    count=fast-slow;
                    if(count==1){
                        res+=""+ch[slow]+ch[fast];
                    }else{
                        res+=""+(--count)+ch[slow]+ch[fast];
                    }
                }
                break;
            }
        }
        return res;
    }
}
