package NiuKe.Basement.chapter08;
//给你一个数组arr，和一个整数aim。如果可以任意选择arr中的
//数字，能不能累加得到aim，返回true或者false
public class SpecialSum {
    //基于递归
    public static boolean isSum(int[] arr,int aim){
        return process1(arr,0,0,aim);
    }

    public static boolean process1(int[] arr,int i,int sum,int aim){
        if(sum==aim){
            return true;
        }
        if(i==arr.length){
            return false;
        }
        return process1(arr,i+1,sum+arr[i],aim) ||
                process1(arr,i+1,sum,aim);
    }

    public static boolean process2(int[] arr,int aim){
        boolean[][] dp=new boolean[arr.length+1][aim+1];
        for(int i=0;i<dp.length;i++){
            dp[i][aim]=true;
        }
        return dp[0][0];
    }
}
