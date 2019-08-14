package HUAWEI;
import java.util.*;

public class SongGroup {

    public static int getNum(int[] nums){
        if(nums.length%2!=0){
            return minNum(nums,nums.length/2);
        }else{
            return Math.min(minNum(nums,nums.length/2-1),minNum(nums,nums.length/2));
        }
    }

    public static int minNum(int[] nums,int middle){
        int len=nums.length;
        int count=0;
        int pre=middle-1;
        int in=middle+1;
        int temp1=nums[middle];
        while(pre >=0){
            if(nums[pre]<temp1){
                temp1=nums[pre];
                pre--;
            }else{
                count++;
                pre--;
            }
        }
        int temp2=nums[middle];
        while(in<len){
            if(nums[in]<temp2){
                temp2=nums[in];
                in++;
            }else{
                count++;
                in++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int num = in.nextInt();
            if(num<=2){
                System.out.println(0);
            }
            int[] members=new int[num];//存储每一个数据元素
            int[] left_queue=new int[num];//数据元素从左到右对应的最大递增子序列数
            int[] right_queue=new int[num];//数据元素从右到左对应的最大递增子序列数
            for(int i=0;i<num;i++){//初始化各个数组数据
                members[i]=in.nextInt();
                left_queue[i]=1;
                right_queue[i]=1;
            }
            for(int i=0;i<num;i++){
                for(int j=0;j<i;j++){
                    if(members[i]>members[j]&&left_queue[j]+1>left_queue[i])
                        left_queue[i]=left_queue[j]+1;
                }
            }
            for(int i=num-1;i>=0;i--){
                for(int j=num-1;j>i;j--){
                    if(members[i]>members[j]&&right_queue[j]+1>right_queue[i])
                        right_queue[i]=right_queue[j]+1;
                }
            }
            int max=0;
            for(int i=0;i<num;i++){
                if(left_queue[i]+right_queue[i]>max)
                    max=left_queue[i]+right_queue[i];
            }
            System.out.println(num-max+1);
        }
    }
}
