package Test;


import java.util.*;

public class Test10 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println(getResult(arr,k));
        }
    }

    public static int getResult(int[] arr,int k){
        int count=0,len=arr.length;
        for(int i=0;i<len;i++){
            int l=i-arr[i]<=0?0:i-arr[i];
            int r=(i+arr[i]>=len-1)?len-1:i+arr[i];
            if(r-l+1>=k){
                count++;
            }
        }
        return count;
    }
}
