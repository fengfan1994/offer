package xiaozhao2018;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.PriorityQueue;
import java.util.Scanner;

//给定一个无序数组，包含正数、负数和0，要求从中找出3个数的乘积，使得乘积最大，要求时间复杂度：O(n)，空间复杂度：O(1)
public class MaxProduct {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int len=sc.nextInt();
            long[] nums=new long[len];
            for(int i=0;i<len;i++){
                nums[i]=sc.nextLong();
            }
            getResults(nums,len);
        }
    }

    public static void getResults(long[] nums,int len){

        long[] max={Long.MIN_VALUE,Long.MIN_VALUE,Long.MIN_VALUE};
        long[] min={Long.MAX_VALUE,Long.MAX_VALUE};
        for(int i=0;i<len;i++){
            if (nums[i]> max[2]) {
                if (nums[i]> max[1]) {
                    if (nums[i]> max[0]) {
                        max[2]=max[1];
                        max[1]=max[0];
                        max[0]=nums[i];
                    } else {
                        max[2]=max[1];
                        max[1]=nums[i];
                    }
                } else {
                    max[2]=nums[i];
                }
            }
            if (nums[i]< 0) {
                if (nums[i]< min[1]) {
                    if (nums[i] < min[0]) {
                        min[1]= min[0];
                        min[0]=nums[i];
                    } else {
                        min[1]=nums[i];
                    }
                }
            }
        }
        long result=Math.max(max[0]*max[1]*max[2],max[0]*min[0]*min[1]);
        System.out.println(result);
    }
}
