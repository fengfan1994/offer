package Leetcode;

public class InsertPosition {
    public int searchInsert(int[] A, int target) {
        if(target>A[A.length-1]){
            return A.length;
        }
        if(target<A[0]){
            return 0;
        }
        int left=0;
        int right=A.length-1;
        int middle=0;
        int result=0;
        while(left<=right){
            middle=(left+right)/2;
            if(A[middle]==target){
                result=middle;
                return result;
            }else if(A[middle]<target){
                left=middle+1;
                if(A[left]>target){
                    result=left;
                    return result;
                }
            }else{
                right=middle-1;
                if(A[right]<target){
                    return middle;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int[] nums={0};
        int res=new InsertPosition().searchInsert(nums,7);
        System.out.println(res);
    }
}
