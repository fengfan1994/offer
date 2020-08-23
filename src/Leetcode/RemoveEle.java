package Leetcode;

public class RemoveEle {
    public int removeElement(int[] A, int ele) {
        if(A==null || A.length==0){
            return 0;
        }
        int start=0;
        int end=A.length-1;
        while(start<=end){
            if(A[start]==ele && A[end]!=ele){
                swap(A,start,end);
                start++;
                end--;
            }else if(A[start]==ele && A[end]==ele){
                end--;
            }else if(A[start]!=ele && A[end]!=ele){
                start++;
            }else{
                end--;
            }
        }
        return end+1;
    }

    public void swap(int[] A,int i,int j){
        int temp=A[j];
        A[j]=A[i];
        A[i]=temp;
    }
}
