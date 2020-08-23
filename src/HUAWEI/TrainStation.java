package HUAWEI;

import java.util.*;

public class TrainStation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int[] in=new int[n];
            for(int i=0;i<n;i++){
                in[i]=sc.nextInt();
            }
            ArrayList<int[]> result=new ArrayList<>();
            Permutation(in,0,n,result);
            Set<String> sortResult=new TreeSet<>();
            for(int[] out:result){
                if(isLegal(in,out,n)){
                    StringBuilder sb=new StringBuilder();
                    for(int i=0;i<n-1;i++){
                        sb.append(out[i]+" ");
                    }
                    sb.append(out[n-1]);
                    sortResult.add(sb.toString());
                }
            }
            for(String s:sortResult){
                System.out.println(s);
            }
        }
    }

    //判断一个序列是不是一个对应栈的出栈序列
    public static boolean isLegal(int[] in,int[] out,int n){
        if(in==null || out==null){
            return false;
        }
        Stack<Integer> stack=new Stack<>();
        int index=0;
        for(int i=0;i<n;i++){
            stack.push(in[i]);
            while(!stack.isEmpty()&&stack.peek()==out[index]){
                stack.pop();
                index++;
            }
        }
        return stack.isEmpty();
    }

    //一个字符串的全排列
    private static void Permutation(int[] A,int start,int n,ArrayList<int[]> result){
        if(start == n){
            return;
        }
        if(start == n-1){
            int[] B = A.clone();
            result.add(B);
            return;
        }
        for(int i=start;i<n;i++){
            swap(A,start,i);
            Permutation(A,start+1,n,result);
            swap(A,start,i);
        }

    }

    private static void swap(int[] a, int left, int right) {
        int temp = a[left];
        a[left] = a[right];
        a[right] = temp;
    }
}
