package xiaozhao2018;

import java.util.ArrayList;
import java.util.Scanner;

//寻找区间内的神奇数
public class MagicNumber {
    static ArrayList<Integer> list=new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int l=sc.nextInt();
            int r=sc.nextInt();
            getRes(l,r);
        }
    }

    public static void getRes(int l,int r){
        int res=0;
        for(int i=l;i<=r;i++){
            if(isValid(i)){
                res++;
            }
        }
        System.out.println(res);

    }

    public static boolean isValid(int num){
        list.clear();
        int temp=0,sum=0;
        while(num!=0){
            temp=num%10;
            sum+=temp;
            list.add(temp);
            num=num/10;
        }
        if(sum%2!=0){
            return false;
        }
        sum=sum/2;
        return isIllegal(list,sum,0);
    }

    public static boolean isIllegal(ArrayList<Integer> list,int sum,int start){
        if(sum<0|| start>=list.size()){
            return false;
        }
        if(sum==0 && start==list.size()-1){
            return true;
        }
        return isIllegal(list,sum-list.get(start),start+1) || isIllegal(list,sum,start+1);
    }
}
