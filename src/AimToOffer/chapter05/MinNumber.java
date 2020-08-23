package AimToOffer.chapter05;

import java.util.Arrays;
import java.util.Comparator;

public class MinNumber {
    public void printMinNumber(int[] nums){
        if(nums.length==0 || nums==null){
            return;
        }
        int len=nums.length;
        String[] str=new String[len];
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<len;i++){
            str[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String c1=o1+o2;
                String c2=o2+o1;
                return c1.compareTo(c2);
            }
        });
        for(int i=0;i<len;i++){
            sb.append(str[i]);
        }
        System.out.println(sb);
    }

    public static void main(String[] args){
        int[] nums={2,4,3,1,5,6,7,2,3};
        new MinNumber().printMinNumber(nums);
    }
}
