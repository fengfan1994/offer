package HUAWEI;

import java.util.*;

public class StringBeauty {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int len=sc.nextInt();
            String[] strs=new String[len];
            for(int i=0;i<len;i++){
                strs[i]=sc.next();
            }
            for(int i=0;i<len;i++){
                System.out.println(getBeauty(strs[i]));
            }
        }
    }

    public static int getBeauty(String s){
        int count=0;
        HashMap<Character,Integer> hs=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(hs.containsKey(s.charAt(i))){
                hs.put(s.charAt(i),hs.get(s.charAt(i))+1);
            }else{
                hs.put(s.charAt(i),1);
            }
        }
        List<Integer> list=new ArrayList<>();
        for(char c:hs.keySet()){
            list.add(hs.get(c));
        }
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            count=count+list.get(i)*(27-list.size()+i);
        }
        return count;
    }
}
