package NiuKe.Improvement.chapter04;

import java.util.HashMap;

//给定一个数组arr，和一个整数num，求在arr中，累加和等于num的最长
//子数组的长度
public class LongestSumSubArrayLength {
    public static int maxLength(int[] arr,int k){
        if(arr==null ||arr.length==0){
            return 0;
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int len=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(map.containsKey(sum-k)){
                len=Math.max(i-map.get(sum-k),len);
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return len;
    }

    public static int[] generateArray(int size) {
        int[] result = new int[size];
        for (int i = 0; i != size; i++) {
            result[i] = (int) (Math.random() * 11) - 5;
        }
        return result;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i != arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = generateArray(20);
        printArray(arr);
        System.out.println(maxLength(arr, 10));

    }
}
