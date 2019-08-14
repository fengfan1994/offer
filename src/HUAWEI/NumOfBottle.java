package HUAWEI;

import java.util.*;

public class NumOfBottle {
    public int getNum(int i){
        int sum=0;
        int currentNum=i;
        int res1=0;
        int res2=0;
        if(i==1){
            return sum;
        }
        while(currentNum>=3){
            res1=currentNum/3;
            res2=currentNum%3;
            sum=sum+res1;
            currentNum=res1+res2;
        }
        if(currentNum==2){
            sum=sum+1;
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int k=sc.nextInt();
            if(k==0){
                break;
            }else{
                list.add(k);
            }
        }
        NumOfBottle nob=new NumOfBottle();
        for(int i:list){
            System.out.println(nob.getNum(i));
        }
        
    }

    //应用动态规划求已知数组的最长子序列
    public static int lengthOfMaxSubIncreaseArray(int[] array, int n){
        if(n==1){
            return 1;
        }
        int maxLen = 0;
        int[] list = new int[n];
        for(int i=0;i<n;i++){
            list[i]=1;
            for(int j=0;j<i;j++){
                if(array[j]<array[i]&&list[j]+1>list[i]){
                    list[i] = list[j]+1;
                }
            }
        }
        for(int i=0;i<n;i++){
            if(list[i]>maxLen)
                maxLen = list[i];
        }
        return maxLen;
    }
}
