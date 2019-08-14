package Test;
import java.util.*;
public class Test11 {

    //每次实例化都会执行一次
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int[] nums=new int[n];
            for(int i=0;i<n;i++){
                nums[i]=sc.nextInt();
            }
            int target=sc.nextInt();
            ArrayList<Integer> list=new ArrayList<>();
            getResult(nums,target,0,0,list);
            if(list.size()!=0){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }
    }

    public static void getResult(int[] nums,int target,int sum,int k,ArrayList<Integer> list){
        if(sum!=target && k>=nums.length){
            return;
        }
        if(sum==target){
            list.add(sum);
            return;
        }
        for(int i=k;i<nums.length;i++){
            sum=sum+nums[i];
            getResult(nums,target,sum,i+1,list);
            sum=sum-nums[i];
        }
    }

    public static void getResult(String s,HashSet<String> hs){
        if(hs.isEmpty()){
            hs.add(s);
        }
        for(String str:hs){
            String temp=str+str;
            if(temp.indexOf(s)>0){
                return;
            }
        }
        hs.add(s);
    }
}
