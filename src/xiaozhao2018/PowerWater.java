package xiaozhao2018;

import java.util.Comparator;
import java.util.HashMap;
import java.util.*;

public class PowerWater {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            int target=sc.nextInt();
            getResult(arr,target);
        }
    }

    public static void getResult(int[] arr,int target){
        ArrayList<Integer> list=new ArrayList<>();
        int l=0,r=arr.length-1;
        while(l<r){
            if(arr[l]+arr[r]==target){
                list.add(arr[l++]);
                list.add(arr[r--]);
            }else if(arr[l]+arr[r]>target){
                r--;
            }else{
                l++;
            }
        }
        if(list.isEmpty()){
            System.out.println("NO");
            return;
        }
        for(int i=0;i<list.size();i=i+2){
            System.out.println(list.get(i)+" "+list.get(i+1));
        }
    }
}
