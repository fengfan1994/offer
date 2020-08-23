package xiaozhao2018;

import java.util.*;

public class NumberGame {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int len=sc.nextInt();
            int[] nums=new int[len];
            for(int i=0;i<len;i++){
                nums[i]=sc.nextInt();
            }
            Arrays.sort(nums);
            System.out.println(getResults(nums,nums.length));
        }
    }

    public static int getResults(int[] nums,int k){
        if(k==1){
            return nums[k-1]+1;
        }
        int sum=0;
        for(int i=0;i<k;i++){
            if(nums[i]>sum+1){
                break;
            }else{
                sum+=nums[i];
            }
        }
        return sum+1;
    }
}
