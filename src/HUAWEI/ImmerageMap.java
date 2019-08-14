package HUAWEI;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeMap;

public class ImmerageMap {
    public static void main(String[] args) {

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(new ImmerageMap().getWithoutDuplicatedNum(120345677));
        /*
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int num=sc.nextInt();
            TreeMap<Integer,Integer> hm=new TreeMap<>();
            for(int i=0;i<num;i++){
                int index=sc.nextInt();
                int value=sc.nextInt();
                if(hm.containsKey(index)){
                    hm.put(index,hm.get(index)+value);
                }else{
                    hm.put(index,value);
                }
            }
            for(int i:hm.keySet()){
                System.out.println(i+" "+hm.get(i));
            }
        }
        */
    }
    //注意数值溢出和以0开头的数字问题
    public int getWithoutDuplicatedNum(int num){
        int result=0;
        HashSet<Integer> hs=new HashSet<>();
        while(num>0){
            int res=num%10;
            if(!(hs.contains(res))){
                result=result*10+res;
                hs.add(res);
            }
            num/=10;
        }
        return result;
    }
}
