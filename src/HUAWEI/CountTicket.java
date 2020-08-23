package HUAWEI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

public class CountTicket {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int num=sc.nextInt();
            List<String> list1=new ArrayList<>();
            for(int i=0;i<num;i++){
                list1.add(sc.next());
            }
            int total=sc.nextInt();
            List<String> list2=new ArrayList<>();
            for(int i=0;i<total;i++){
                list2.add(sc.next());
            }
            getResults(list1,list2);
        }
    }

    public static void getResults(List<String> list1,List<String> list2){
        LinkedHashMap<String,Integer> hm=new LinkedHashMap<>();
        for(String s:list1){
            hm.put(s,0);
        }
        for(String s:list2){
            if(hm.containsKey(s)){
               hm.put(s,hm.get(s)+1);
            }
        }
        int total=list2.size();
        int count=0;
        for(String s:hm.keySet()){
            System.out.println(s+":"+hm.get(s));
            count=count+hm.get(s);
        }
        System.out.println("Invalid:"+(total-count));

    }
}
