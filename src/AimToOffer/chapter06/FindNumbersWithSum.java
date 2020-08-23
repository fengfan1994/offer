package AimToOffer.chapter06;

public class FindNumbersWithSum {
    //递增数组中和为s的两个数字，输出任意一组
    public boolean findNumbersWithSum(int[] nums,int sum){
        int length=nums.length;
        if((nums[length-1]+nums[length-2]<sum)|| nums[0]>sum){
            return false;
        }
        int begin=0;
        int end=length-1;
        boolean isFind=false;
        while(begin<=end){
            if ((nums[begin]+nums[end])==sum) {
                isFind=true;
                break;
            }
           else if((nums[begin]+nums[end])>sum){
                end--;
            }else{
                begin++;
            }
        }
        return isFind;
    }

    //输入一个正数s，打印出所有和为s的连续整数序列
    public void printNumbersOfTarget(int sum){
        if(sum<3){
            return;
        }
        int small=1;
        int big=2;
        int middle=(1+sum)/2;
        int curSum=small+big;
        while(small<middle){
            if(curSum==sum){
                printNumber(small,big);
            }
            while (curSum>sum && small<middle){
                curSum-=small;
                small++;
                if(curSum==sum){
                    printNumber(small,big);
                }
            }
            big++;
            curSum+=big;
        }
    }

    public void printNumber(int start,int end){
        for(int i=start;i<=end;i++){
            System.out.print(i);
            System.out.println();
        }
    }

}
