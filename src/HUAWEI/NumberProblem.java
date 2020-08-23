package HUAWEI;

import java.util.*;

public class NumberProblem {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int target=sc.nextInt();
            getResult(target);
        }
    }

    public static void getResult(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(i%7==0 || String.valueOf(i).indexOf('7')!=-1){
                count++;
            }
        }
        System.out.println(count);
    }

    //基于递归从已知数组中寻找和位特定值
    public static boolean test(List<Integer> list,int abs,int count,int index){
        if(list.isEmpty()&&abs==0)
            return true;
        if(count==1){
            return abs==Math.abs(list.get(index));
        }
        count--;
        int abs1=Math.abs(abs-list.get(index));
        int abs2=Math.abs(abs+list.get(index));
        index++;
        return test(list,abs1,count,index)||test(list,abs2,count,index);
    }
}
