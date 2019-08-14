package xiaozhao2018;

import java.util.*;

public class StringCount {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String res=sc.nextLine();
            HashMap<Character,Integer> map=new HashMap<>();
            for(int i=0;i<res.length();i++){
                char ch=res.charAt(i);
                if(!map.containsKey(ch)){
                    map.put(ch,1);
                }else{
                    map.put(ch,map.get(ch)+1);
                }
            }
            Set<Character> set=map.keySet();
            Object[] arr=set.toArray();
            Arrays.sort(arr);
            for(Object key:arr) {
                System.out.print(""+key+map.get(key));
            }
            System.out.println();
        }
    }
}
